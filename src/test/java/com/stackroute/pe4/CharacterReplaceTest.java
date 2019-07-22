package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplaceTest {

        CharacterReplace characterReplace;
        @Before
        public void setUp() throws Exception {
            characterReplace=new CharacterReplace();
        }
        @After
        public void tearDown() throws Exception {
            characterReplace=null;
        }
        //test case for replacing character
        @Test
        public void givenStringShouldReturnStringWithReplacedCharacters(){
            String actualResult=characterReplace.characterReplace("daily dry");
            assertEquals("",actualResult);
        }
    }


