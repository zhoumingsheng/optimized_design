package com.design.infra.test;

import com.design.infra.composite.AbstractLeaf;
import com.design.infra.context.BaseContext;
import com.design.infra.pojo.ManagedResult;

public class TestLeaf extends AbstractLeaf{

    @Override
    protected ManagedResult execute(BaseContext context) throws Exception {
        String str = context.get(TestContext.STRING);
        System.out.println("TestLeaf execute "+str);
        return ManagedResult.getSuccessResult();
    }
    
}
