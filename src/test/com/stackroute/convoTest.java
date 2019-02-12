package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class convoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkLetterv() {
        convo ob=new convo();
        String expectedValue= "a-is a vowel";
        String actualValue = ob.checkLetter("a");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkLetterc() {
        convo ob=new convo();
        String expectedValue= "b-is a consonant";
        String actualValue = ob.checkLetter("b");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkLetter() {
        convo ob=new convo();
        String expectedValue= "a-is a vowelp-is a consonant";
        String actualValue = ob.checkLetter("ap");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkLetternl() {
        convo ob=new convo();
        String expectedValue= "Input is not a letter";
        String actualValue = ob.checkLetter("2");
        assertEquals(expectedValue,actualValue);
    }
}