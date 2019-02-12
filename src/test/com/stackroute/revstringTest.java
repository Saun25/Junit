package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class revstringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        revstring ob = new revstring();
        String expectedValue= "olleh";
        String actualValue = ob.reverse("hello");
        assertEquals(expectedValue,actualValue);
    }
}