/**
 * HackerRank Challenge: Print the absolute difference between the sums of the 
 * matrix's two diagonals as a single integer. 
 * 
 * Pravalika TIrumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalDifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
     //o(n)
    	int diag1=0,diag2=0,diff=0;
        int n=a.length;
        for (int i=0;i<n;i++){
          diag1 = diag1+a[i][i];
            diag2=diag2+a[i][n-i-1];
       }
        //o(n2)
       /*for(int i=0;i<n;i++){
	   for(int j=0;j<n;j++){
		if(i==j)
		diag1=diag1+a[i][j];
		if(i== n-j-1)
		diag2=diag2+a[i][j];
	}
} */
    diff = Math.abs(diag1-diag2);
        return diff;
    }

    

    public static void main(String[] args) throws IOException {
      int [][]a = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
      int diag_diff = diagonalDifference(a);
      System.out.println(diag_diff);
    }
}
