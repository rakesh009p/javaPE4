package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
//Input : She sells seashells by the seashore Given word: se Output :
//Found at: 4 - 6
//Found at: 10 - 12

public class StringMatcher {
    public String matching(String inputString,String givenString){
            StringBuffer stringBuffer=new StringBuffer();
            //generates pattern
            Pattern pattern=Pattern.compile(givenString);
            //matches with the pattern
            Matcher matcher=pattern.matcher(inputString);
            while (matcher.find()){
                //append gives reference
                stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
            }
            return stringBuffer.toString().trim();
        }
    }