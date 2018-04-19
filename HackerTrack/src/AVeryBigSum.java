/**
 * Given an array of integers, find the sum of its elements.
 * 
 * Pravalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AVeryBigSum {

    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
       long sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        return sum;
    }

   

    public static void main(String[] args) throws IOException {
      //  int n = 6;
        long[] ar = {10,2,3,4,5,3};       
        long result = aVeryBigSum(6, ar);
        System.out.println(result);
       
    }
}
