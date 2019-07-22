package com.stackroute.pe4;


//1. Write a java program to count the total number of occurrences of a given character in a string without using any loop?
//        For Example- Java is java again java again count number of occurrence of a in the given string


public class OccuranceOfChar {
    public int charOccurrance(String string) {
        //replacing a with space and subtracting from length //
        string.replace("a", "").length();
        int charcount = string.length() - string.replaceAll("a", "").length();
        //storing the value of count//
       int count=charcount;
       return  count;
    }
}
