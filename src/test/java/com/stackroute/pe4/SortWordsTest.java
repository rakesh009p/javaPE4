package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords sortWords;

    @Before
    public void setUp() throws Exception {
        sortWords= new SortWords();

    }

    @After
    public void tearDown() throws Exception {
        sortWords=null;
    }

    @Test
    public void givenStringShouldReturnSortedString() {
        String []actualResult= sortWords.sortWords("my name is rakesh and i am from andhra pradesh");
        String []expected="am,and, andhra, from,i,is,my,name,pradesh,rakesh".split("[\\s,]+");
        assertArrayEquals(expected,actualResult);
    }
    @Test
    public void givenAStringShouldReturnSortedString() {
        String []actual=sortWords.sortWords(null);
        assertNull(actual);
    }
}