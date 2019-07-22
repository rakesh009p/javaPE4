package com.stackroute.pe4;

public class OccuranceOfChar {
    public int charOccurrance(String string) {
       string = "Java is java again java again";
        string.replace("a", "").length();
        int charcount = string.length() - string.replaceAll("a", "").length();
       int count=charcount;
       return  count;
    }
}
