/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, 
 * awarding points on a scale from  to  for three categories: problem clarity, originality, and 
 * difficulty. We define the rating for Alice's challenge to be the triplet , and the rating for 
 * Bob's challenge to be the triplet .Your task is to find their comparison points by comparing  
 * with ,  with , and  with .
 * 
 * Pravalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CompareTheTriplets {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
         int x=0,y=0;        
       
        if(a0 > b0) x=x+1;
        if (a0 < b0) y = y+1;
         if(a1 > b1) x=x+1;
        if (a1 < b1) y = y+1;
         if(a2 > b2) x=x+1;
        if (a2 < b2) y = y+1;
        int [] res={x,y};
        return res; 
    }           
  

   

    public static void main(String[] args) throws IOException {
       
    	Scanner s = new Scanner(System.in);
        int a0 = s.nextInt();
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int b0 = s.nextInt();
        int b1 = s.nextInt();
        int b2 = s.nextInt();

        int[] result = solve(a0, a1, a2, b0, b1, b2); 
        for(int i=0;i<result.length;i++){
        	System.out.print(result[i]+" ");
        }

      }
}
