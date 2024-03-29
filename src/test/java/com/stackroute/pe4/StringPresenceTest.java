package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPresenceTest {
       StringPresence stringPresence;

    @Before
    public void setUp() throws Exception {
        stringPresence = new StringPresence();
    }

    @After
    public void tearDown() throws Exception {
        stringPresence=null;
    }
    //test case for presence of a word in a string

    @Test
    public void givenStringShouldCheckPresenceAndReturnString() {
        String actualResult = stringPresence.stringPresense("This is Harry.");
        assertEquals("Is Harry Here?true",actualResult);


    }
    //false test case
    @Test
    public void givenAStringShouldCheckPresenceAndReturnString() {
        String actualResult = stringPresence.stringPresense("This is Henry.");
        assertEquals("Is Harry Here?false",actualResult);

    }
}