package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class tomjerryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tom() {
        tomjerry ob = new tomjerry();
        String expectedValue= "tom";
        String actualValue = ob.tj(25);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void jerry() {
        tomjerry ob = new tomjerry();
        String expectedValue= "jerry";
        String actualValue = ob.tj(24);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void nmatch() {
        tomjerry ob = new tomjerry();
        String expectedValue= "Not matching";
        String actualValue = ob.tj(34);
        assertEquals(expectedValue,actualValue);
    }
}