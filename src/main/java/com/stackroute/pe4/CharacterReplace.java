package com.stackroute.pe4;

public class CharacterReplace {
    public String  characterReplace(String string) {
        string = "daily dry";
        String string1 = string.replace("d", "f");

        string1 = string1.replace("l", "t");

       return(string1);
    }
}
