package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceOfCharTest {
    OccuranceOfChar occuranceOfChar;

    @Before
    public void setUp() throws Exception {
        occuranceOfChar=new OccuranceOfChar();
    }

    @After
    public void tearDown() throws Exception {
        occuranceOfChar=null;
    }

    @Test
    public void givenStringShouldReturnCharCount() {
        int actualResult=occuranceOfChar.charOccurrance("Java is java again java again");
        assertEquals(10,actualResult);
    }
}