package com.stackroute;

public class palindrome {

    public String palin(long num) {
        long rem, i = 0, sum = 0;
        long palindrome = 0;
        long temp = num;
        String str = "";
        while (temp > 0) {
            i++;
            rem = temp % 10;
            palindrome = palindrome * 10 + rem;
            temp = temp / 10;
            if (i % 2 == 0)
                sum += rem;
        }

        if (num == palindrome)
            if (sum > 25)
                str = (Long.toString(palindrome) + " is palindrome and sum of even numbers is greater than 25");
            else
                str = (Long.toString(palindrome) + " is palindrome and sum of even numbers is less than 25");
        else
            str = (Long.toString(num) + " is not a palindrome");

        return str;
    }
}