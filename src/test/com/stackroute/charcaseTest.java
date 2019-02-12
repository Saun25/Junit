package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class charcaseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void charCheckCaps() {
        charcase ob = new charcase();
        String expectedValue= "Capital letter";
        String actualValue=ob.charCheck('A');
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void charCheckSmall() {
        charcase ob = new charcase();
        String expectedValue= "Small case letter";
        String actualValue=ob.charCheck('a');
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void charCheckDigit() {
        charcase ob = new charcase();
        String expectedValue= "Digit";
        String actualValue=ob.charCheck('2');
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void charCheckSymbol() {
        charcase ob = new charcase();
        String expectedValue= "Symbol";
        String actualValue=ob.charCheck('$');
        assertEquals(expectedValue,actualValue);

    }

}