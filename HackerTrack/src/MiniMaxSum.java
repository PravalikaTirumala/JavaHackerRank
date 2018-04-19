
/**
 *  Hacker rank challenge solution : Print two space-separated long integers 
 *  denoting the respective minimum and maximum values that can be calculated by 
 *  summing exactly four of the five integers.
 * pravalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        int n=arr.length;
        long sum=0,max=0,min=0,val=0;
        for(int i=0;i<n;i++)
            sum=sum+arr[i];
       for(int j=0;j<n;j++){
            val= sum - arr[j];
           if (j==0)
              min = max = val;
          else{
           if (max < val )
               max = val;
           if (min > val )
               min = val;
          }
       }
           System.out.println(min+" "+max);
       }
       
    public static void main(String[] args) {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};

        miniMaxSum(arr);
    }
}
