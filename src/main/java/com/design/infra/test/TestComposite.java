package com.design.infra.test;

import com.design.infra.composite.AbstractComposite;

public class TestComposite extends AbstractComposite{
    private TestLeaf testLeaf = new TestLeaf();

    @Override
    protected void compose() {
        add(testLeaf);
    }

    
    
}
