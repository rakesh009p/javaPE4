package com.stackroute.pe4;

public class TransposeString {
    public  String reverseWord(String string){
        String words[]=string.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder stringBuilder=new StringBuilder(w);
            stringBuilder.reverse();
            reverseWord+=stringBuilder.toString()+" ";
        }
        return reverseWord.trim();
    }
}
