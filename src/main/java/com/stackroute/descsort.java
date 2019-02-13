package com.stackroute;
import java.util.Arrays;

 public class descsort {
    public String sort(String str) {
        int len = str.length();
        String ret;
        int count=len;
        int []arr = new int[len];
        int sum=0;
        while(len>0){
            arr[len-1] = str.charAt(len-1) - '0';
            len--;
        }
        Arrays.sort(arr);
        for(int i=0;i<count;i++) {
            int temp = arr[i];
            arr[i] = arr[count - 1];
            arr[count - 1] = temp;
            count--;
        }
        int j=str.length()-1;
        while(j>0){
            if(j%2==0)
                sum += arr[j];
            j--;
        }

        if(sum>15)     
            ret=("False");
        else
            ret=(" Sum of even numbers:"+Integer.toString(sum));
        return ret;
    }
}