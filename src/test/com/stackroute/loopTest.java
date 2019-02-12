package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class loopTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void series() {
        loop ob = new loop();
        String expectedValue="122333444455555";
        String actualValue=ob.series(5);
        assertEquals(expectedValue,actualValue);
    }
}