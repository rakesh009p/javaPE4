package com.stackroute.pe4;
//Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
//Input: This is Harry. Output: Is Harry here ? true Input : This is Henry. Output: Is Harry here ? False

public class StringPresence {
    public String stringPresense(String inputWord) {
        //checks for harry in a given string
        if (inputWord.contains("Harry")) {
            String result= "Is Harry Here?" + inputWord.contains("Harry");
            return result;
        }
        //if it not contains returns string with boolean
        else {
            boolean result = inputWord.contains("Harry");
            String result1= "Is Harry Here?" + result;
            return  result1;
        }
    }}

