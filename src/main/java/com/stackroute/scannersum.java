package  com.stackroute;

public class scannersum {

    public int sum(String str) {
        String []sarr=str.split(" ");
        int sum=0;
        for(String s:sarr)
           sum+=Integer.parseInt(s);
        return sum;
    }
}