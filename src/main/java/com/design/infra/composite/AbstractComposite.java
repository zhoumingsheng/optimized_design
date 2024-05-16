package com.design.infra.composite;

import java.time.Clock;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import com.design.infra.constant.CommonConstants;
import com.design.infra.context.BaseContext;
import com.design.infra.helper.ObjectHelpers;
import com.design.infra.pojo.ManagedResult;
import com.design.infra.util.TimeUtils;
import com.google.common.collect.Lists;

import cn.hutool.json.JSONUtil;


@SuppressWarnings("all")
public abstract class AbstractComposite extends AbstractComponent {

    private ThreadLocal<List<AbstractComponent>> components = ThreadLocal.withInitial(Lists::newArrayList);

    private ThreadLocal<List<AbstractComponent>> postComponents  = ThreadLocal.withInitial(Lists::newArrayList);

    /**
     * add component to components.
     *
     * @param component component
     */
    @Override
    protected void add(final AbstractComponent component) {
        getComponents().add(component);
    }

    /**
     * add postComponent to postComponents.
     *
     * @param postComponent postComponent
     */
    @Override
    protected void addPost(final AbstractComponent postComponent) {
        getPostComponents().add(postComponent);
    }

    /**
     * use {@link #getValidator} to get validator, then validate param by {@link UnifiedValidator#validate}.
     *
     * @param context context
     * @throws Exception exception
     */
    @Override
    protected void validate(final BaseContext context) throws Exception {}

    /**
     * init.
     *
     * @param context context
     * @throws Exception exception
     */
    @Override
    protected void init(final BaseContext context) throws Exception {}

    /**
     * compose leaf (or composite) to composite by {@link #add} or {@link #addPost}.
     */
    @Override
    protected abstract void compose();

    /**
     * execute: compose and traversal.
     *
     * @param context context
     * @return result
     * @throws Exception exception
     */
    @Override
    protected final ManagedResult execute(final BaseContext context) throws Exception {
        ManagedResult result = ManagedResult.getSuccessResult();
        StringBuilder logBuilder = new StringBuilder();
        Instant totalStart = Instant.now(Clock.systemUTC());
        String totalStartFormat = "Component: %s start, start = %s." + CommonConstants.DBL_EOL;
        logBuilder.append(String.format(totalStartFormat, this.getClass().getSimpleName(), TimeUtils.toStringWithMilli(totalStart)));
        reset();
        try {
            compose();
            String format = "Component(%s): %s has executed, start = %s, end = %s, span = %s," + CommonConstants.EOL + "result = %s." + CommonConstants.DBL_EOL;
            int sequence = 1;
            for (AbstractComponent component : getComponents()) {
                Instant start  =Instant.now(Clock.systemUTC());
                result = ObjectHelpers.identityWithFilter(wrap(() -> component.execute(context)),
                        x -> x.isExceptioned() && component.isDegradable(),
                        x -> wrap(() -> component.fallback(context, x.getException())));
                Instant end = Instant.now(Clock.systemUTC());
                logBuilder.append(String.format(format, sequence++, component.getClass().getSimpleName(), TimeUtils.toStringWithMilli(start), TimeUtils.toStringWithMilli(end), TimeUtils.getIntervalMillis(start, end), JSONUtil.toJsonStr(result)));
                Objects.requireNonNull(result, "result cannot be null");
                if (result.nonSuccess() || result.isInterrupted()) {
                    break;
                }
            }
            String postFormat = "PostComponent(%s): %s has executed, start = %s, end = %s, span = %s," + CommonConstants.EOL + "result = %s." + CommonConstants.DBL_EOL;
            int postSequence = 1;
            for (AbstractComponent postComponent : getPostComponents()) {
                Instant postStart  = Instant.now(Clock.systemUTC());
                ManagedResult postResult = ObjectHelpers.identityWithFilter(wrap(() -> postComponent.execute(context)),
                        x -> x.isExceptioned() && postComponent.isDegradable(),
                        x -> wrap(() -> postComponent.fallback(context, x.getException())));
                Instant postEnd = Instant.now(Clock.systemUTC());
                logBuilder.append(String.format(postFormat, postSequence++, postComponent.getClass().getSimpleName(), TimeUtils.toStringWithMilli(postStart), TimeUtils.toStringWithMilli(postEnd), TimeUtils.getIntervalMillis(postStart, postEnd), JSONUtil.toJsonStr(postResult)));
                Objects.requireNonNull(postResult, "postResult cannot be null");
                if (postResult.isExceptioned() || postResult.isInterrupted()) {
                    break;
                }
            }
        } finally {
            reset();
            Instant totalEnd = Instant.now(Clock.systemUTC());
            String totalEndFormat = "Component: %s end, end = %s, span = %s," + CommonConstants.EOL + "result = %s."+ CommonConstants.DBL_EOL;
            logBuilder.append(String.format(totalEndFormat, this.getClass().getSimpleName(), TimeUtils.toStringWithMilli(totalEnd), TimeUtils.getIntervalMillis(totalStart, totalEnd), JSONUtil.toJsonStr(result)));
        }
        return result;
    }

    @Override
    protected final ManagedResult fallback(final BaseContext context, final Exception exception) throws Exception {
        throw exception;
    }

    @Override
    protected final boolean isDegradable() {
        return false;
    }

    private void reset() {
        components.remove();
        postComponents.remove();
    }

    private List<AbstractComponent> getComponents() {
        return components.get();
    }

    private List<AbstractComponent> getPostComponents() {
        return postComponents.get();
    }
    
}
