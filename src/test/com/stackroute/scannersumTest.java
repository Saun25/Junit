package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class scannersumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        scannersum ob=new scannersum();
        int expectedValue= 41;
        int actualValue = ob.sum("12 23 2 4");
        assertEquals(expectedValue,actualValue);
    }
}