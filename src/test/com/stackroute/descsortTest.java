package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class descsortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortf() {
        descsort ob = new descsort();
        String expectedValue= "False";
        String actualValue = ob.sort("5468697");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void sortt() {
        descsort ob = new descsort();
        String expectedValue= " Sum of even numbers:12";
        String actualValue = ob.sort("546798");
        assertEquals(expectedValue,actualValue);
    }
}