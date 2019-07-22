package com.stackroute.pe4;
// Write a program to transpose the given string.
//Input String : a quick brown fox jumps over the lazy dog Output String: a kciuq nworb xof spmuj revo eht yzal god

public class TransposeString {
    public  String reverseWord(String string){
        //spliting the string usin split()//
        String words[]=string.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder stringBuilder=new StringBuilder(w);
            stringBuilder.reverse();
            //reversing the word in a string//
            reverseWord+=stringBuilder.toString()+" ";
        }
        return reverseWord.trim();//trim() to eliminate spaces//
    }
}
