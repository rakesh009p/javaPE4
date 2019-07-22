package com.stackroute.pe4;

import java.util.Arrays;

public class SortWords {

    public String[] sortWords(String paragraph){
        if(paragraph==null){
            return null;
        }
        String []string=paragraph.split("[\\s,]+");
        Arrays.sort(string);
        return string;
    }
}

