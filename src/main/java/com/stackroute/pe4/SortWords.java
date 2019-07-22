package com.stackroute.pe4;
//Write a program that sets up a String variable containing a paragraph of text of your choice.
// a. Extract the words from the text and sort them into alphabetical order. b. Display the sorted list of words.

import java.util.Arrays;

public class SortWords {

    public String[] sortWords(String paragraph){
        //if it is null //
        if(paragraph==null){
            return null;
        }
        //split the paragraph and applying sorting//
        String []string=paragraph.split("[\\s,]+");
        Arrays.sort(string);
        return string;
    }
}

