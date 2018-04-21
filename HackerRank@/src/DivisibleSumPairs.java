/**
 * You are given an array of n integers, , and a positive integer, k . Find and print the number of (i,j) pairs
 *  where i<j and  ai+aj  is divisible by k . Print the number of (i,j) pairs where  i<j and  ai+aj  is evenly divisible by k.
 * @author Pravalika Tirumala
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
         int count=0;
        if(n <2 || n>100 || k<1 || k>=100)
            return 0;
        else{
           
            for(int i=0;i<n;i++){
                if(ar[i] <1 || ar[i] >100)
                    return 0;
                else{
                    int j=i+1;
                    while(j<n){
                        if((ar[i]+ar[j]) % k == 0)
                          count++;
                           j++; 
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
    	 int n = 6;
         int[] s = {1,3,2,6,1,2};
          int k = 3;
        int result = divisibleSumPairs(n, k, s);
        System.out.println(result);
    }
}
