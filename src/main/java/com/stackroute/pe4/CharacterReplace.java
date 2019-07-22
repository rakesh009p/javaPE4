package com.stackroute.pe4;

//Write a program to replace all d with f and all l with t in the given String //
//Input: daily dry Output: faity fry Original string: daily dry New String: faity fry //

public class CharacterReplace {
    public String  characterReplace(String string) {
        string = "daily dry";
        //replacing d with f//
        String string1 = string.replace("d", "f");
        //replacing l with t//

        string1 = string1.replace("l", "t");

       return(string1);
    }
}
