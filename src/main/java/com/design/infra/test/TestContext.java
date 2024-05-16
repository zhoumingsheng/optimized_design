package com.design.infra.test;

import com.design.infra.context.BaseContext;
import com.design.infra.context.ContextKey;

public class TestContext extends BaseContext{

        public static final ContextKey STRING = new ContextKey("string", String.class);

    
}
