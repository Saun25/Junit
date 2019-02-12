package com.stackroute;
import java.util.Scanner;
import java.lang.Math;
/**
 * guess
 */
public class guess {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int r = (int) (Math.random()* (50 + 1));
        int num;
        do{
            num = in.nextInt();
            if(num>r)
                System.out.println("Number guessed is greater than original number  ");
            else if(num<r)
                System.out.println("Number guessed is less than original number  ");
            else{
                System.out.println("Number guessed matches the original number");
                break;    
            }
        }while(num!=r);
    }
}