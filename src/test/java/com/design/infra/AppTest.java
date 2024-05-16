package com.design.infra;

import org.junit.jupiter.api.Test;

import com.design.infra.test.TestComposite;
import com.design.infra.test.TestContext;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testComposite() {
        TestContext testContext = new TestContext();
        testContext.put(TestContext.STRING, "aa");
        TestComposite test = new TestComposite();
        test.fire(testContext);
    }
}
