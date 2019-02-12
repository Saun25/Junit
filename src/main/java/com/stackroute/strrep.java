package com.stackroute;

public class strrep {
    public String rep(String str,int n) {
        int len = str.length();
        String pstr =  str.substring((len-n), (len));
        //System.out.print(str);
        while(n>0){
            str=str.concat(pstr);
            n--;
        }
        return str;
    }
}