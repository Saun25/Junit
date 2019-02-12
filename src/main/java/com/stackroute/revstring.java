package com.stackroute;

public class revstring {
 public String reverse(String str){
    int len = str.length();
    String rev="";
    while(len>0){
        rev = rev.concat(String.valueOf(str.charAt(len-1)));
        len--;
        }
    return rev;
    }
}