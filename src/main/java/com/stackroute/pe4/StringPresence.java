package com.stackroute.pe4;

public class StringPresence {
    public String stringPresense(String inputWord) {
        if (inputWord.contains("Harry")) {
            String result= "Is Harry Here?" + inputWord.contains("Harry");
            return result;
        }
        else {
            boolean result = inputWord.contains("Harry");
            String result1= "Is Harry Here?" + result;
            return  result1;
        }
    }}

