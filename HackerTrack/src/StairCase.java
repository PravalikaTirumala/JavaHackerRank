/**
 * HackerRank challenge Staircase : Write a program that prints a staircase of size .
 * Prabalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StairCase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        int j;
       for(int i=0;i<n;i++){
           j=0;
           while (j< (n-i-1)){
               System.out.print(" ");
               j++;
           }
           while( j< n){
              System.out.print("#"); 
               j++;
           }                  
           System.out.println();
       }
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
