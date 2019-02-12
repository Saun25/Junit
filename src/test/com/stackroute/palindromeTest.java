package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palinsg25() {
        palindrome ob = new palindrome();
        String expectedValue= "999989999 is palindrome and sum of even numbers is greater than 25";
        String actualValue = ob.palin(999989999l);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void palinsl25() {
        palindrome ob = new palindrome();
        String expectedValue= "12345654321 is palindrome and sum of even numbers is less than 25";
        String actualValue = ob.palin(12345654321l);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void palin() {
        palindrome ob = new palindrome();
        String expectedValue= "2342 is not a palindrome";
        String actualValue = ob.palin(2342l);
        assertEquals(expectedValue,actualValue);
    }

}