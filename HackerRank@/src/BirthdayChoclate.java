/**
 * Consider the chocolate bar as an array of squares, . She wants to find 
 * segments summing to Ron's birth day,  with a length equalling his birth month,
 *  . In this case, there are two segments meeting her criteria: .
 *  s = {2 2 1 3 2} d=4 m=2 2 sets : [2,2][1,3]
 *  Print an integer denoting the total number of ways that Lily can portion her 
 *  chocolate bar to share with Ron.
 *  
 *  Pravalika Tirumala
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChoclate {

    static int solve(int n, int[] s, int d, int m){
        int count=0,i=0;
        if(n >= 1 && n <= 100){
        	
         for(i=0;i< n ;i++){
             int j=i; int sum=0; int index=0;
             while(index < m && j < n){
               sum =sum + s[j];
                 j++; index++;
             }
             if(sum == d)
               count++;  
         }
            if(i == n && count ==0)
                return count;
        }
        else{
            return count;
        }
        
        return count;
    }

    public static void main(String[] args) {
       
        int n = 5;
        int[] s = {1,2,1,3,2};
       
        int d = 3;
        int m = 2;
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
