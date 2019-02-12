package com.stackroute;

public class charcase {

    public String charCheck(char ch ){
        if(Character.isUpperCase(ch))
            return("Capital letter");
        else if(Character.isLowerCase(ch))
            return("Small case letter");
        else if(Character.isDigit(ch))
            return("Digit");
        else
            return("Symbol");
            
    }
}