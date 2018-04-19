/**
 * Hacker Rank Challenge 
 * Given an array of integers, calculate the fractions of its elements that are 
 * positive, negative, and are zeros. Print the decimal value of each fraction on 
 * a new line.
 * 
 * Pravalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        double n=0,pos=0,neg=0;
        n=arr.length;
      for(int i=0;i<n;i++){
           if(arr[i] < 0)neg++;
           if(arr[i] >0)pos++;
      }
        System.out.printf( "%.6f", (pos / n) );
        System.out.printf( "\n%.6f" , (neg / n));
        System.out.printf(  "\n%.6f", ( (n-(pos+neg)) / n));
        
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       int []arr = {-4,0,5,-40,9,20,0,-3,-2,5,6,7,0,0};

        plusMinus(arr);
    }
}
