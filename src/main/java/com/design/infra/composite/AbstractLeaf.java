package com.design.infra.composite;

import com.design.infra.context.BaseContext;
import com.design.infra.pojo.ManagedResult;


@SuppressWarnings("all")
public abstract class AbstractLeaf extends AbstractComponent {

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
     * execute.
     *
     * note that cannot return null, recommend to use {@link ManagedResult#getResult}.
     *
     * @param context context
     * @return result
     * @throws Exception exception
     */
    @Override
    protected abstract ManagedResult execute(final BaseContext context) throws Exception;

    /**
     * fallback when exception occurred.
     *
     * default: cannot fallback.
     *
     * @param context context
     * @param exception context
     * @return result
     * @throws Exception exception
     */
    @Override
    protected final ManagedResult fallback(final BaseContext context, final Exception exception) throws Exception {
        throw exception;
    }

    @Override
    protected final boolean isDegradable() {
        return false;
    }

}
