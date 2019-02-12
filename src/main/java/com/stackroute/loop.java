package com.stackroute;
import java.util.Scanner;


/**
 * loop
 */
public class loop {

    public String series(int n){
        String sr="";
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
                sr=sr.concat(Integer.toString(i));
            return sr;
    }
}