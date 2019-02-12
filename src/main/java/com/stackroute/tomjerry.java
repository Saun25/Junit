package com.stackroute;

public class tomjerry {
    public String tj(int num) {
        if (num % 2 != 0 && num >= 20 && num <= 30)
            return("tom");
        else if (num >= 20 && num <= 30)
            return("jerry");
        else
            return("Not matching");
    }
}