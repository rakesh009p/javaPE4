package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString= new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString=null;
    }
//test case for reversing each word  in string
    @Test
    public void givenStringShouldReturnStringWithReveseWord() {
        String actualResult=transposeString.reverseWord("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",actualResult);

    }
    @Test
    public void givenStringsShouldReturnStringWithReveseWord() {
        String actualResult=transposeString.reverseWord("my name is rakesh");
        assertEquals("ym eman si hsekar",actualResult);

    }
}