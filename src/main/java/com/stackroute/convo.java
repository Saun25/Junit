package com.stackroute;

public class convo {

    public String checkLetter(String str) {
        int len = str.length();
        int count=0;
        String ret="";
        while (len>0){
            char ch = str.charAt(count);
            if(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'I'||ch == 'i'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U')
                ret=ret.concat(String.valueOf(ch)+("-is a vowel"));
            else if(ch>='a' && ch<='z')
                ret=ret.concat(String.valueOf(ch)+ "-is a consonant");
            else
                ret=("Input is not a letter");
            count++;
            len--;
        }
        return ret;
    }
}