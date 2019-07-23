package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {
    StringMatcher stringMatcher;
    @Before
    public void setUp() throws Exception {
        stringMatcher=new StringMatcher();
    }

    @After
    public void tearDown() throws Exception {
        stringMatcher=null;
    }
    //test case for matching the char in string

    @Test
    public void givenStringShouldCheckAndReturnString() {
        String expected="Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";
        String actual=stringMatcher.matching("She sells seashells by the seashore","se");
        assertEquals(expected,actual);
    }
    //not equals case
    @Test
    public void givenStringShouldCheckForNullAndReturnError() {
        String expected="Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";

        String actual=stringMatcher.matching("She sells seashells by the seashore","se");
        assertNotNull(actual);
        assertEquals(expected,actual);
    }
}

