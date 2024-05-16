package com.design.infra.composite;

import com.design.infra.code.ReturnCode;
import com.design.infra.code.ReturnSubcode;
import com.design.infra.context.BaseContext;
import com.design.infra.function.ReturnActionWithEx;
import com.design.infra.pojo.ManagedResult;


@SuppressWarnings("all")
public abstract class AbstractComponent {

    protected void add(final AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    protected void addPost(final AbstractComponent postComponent) {
        throw new UnsupportedOperationException();
    }

    protected void addAsync(final AbstractComponent asyncComponent) {
        throw new UnsupportedOperationException();
    }

    protected void validate(final BaseContext context) throws Exception {
        throw new UnsupportedOperationException();
    }

    protected void init(final BaseContext context) throws Exception {
        throw new UnsupportedOperationException();
    }

    protected ManagedResult execute(final BaseContext context) throws Exception {
        throw new UnsupportedOperationException();
    }

    protected ManagedResult fallback(final BaseContext context, final Exception exception) throws Exception {
        throw new UnsupportedOperationException();
    }

    protected boolean isDegradable() {
        throw new UnsupportedOperationException();
    }

    protected void compose() {
        throw new UnsupportedOperationException();
    }

    public final ManagedResult fire(final BaseContext context) {
        return wrap(() -> {
            validate(context);
            init(context);
            return execute(context);
        });
    }

    protected final ManagedResult wrap(final ReturnActionWithEx<ManagedResult> action) {
        try {
            return action.execute();
        }   catch (Exception e) {
            return ManagedResult.getResult(ReturnCode.SYS_ERR, ReturnSubcode.DEFAULT, "unexpected exception occurred", e.getMessage(), e);
        }
    }

   
}
