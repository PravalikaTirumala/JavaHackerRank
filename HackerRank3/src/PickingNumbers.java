/**
 * Pravalika Tirumala
 * 
 * Hacjer Rank challenge: Given an array of integers, find and print the maximum number of integers you can 
 * select from the array such that the absolute difference between any two of the chosen integers is less than
 *  or equal to 1.
 *  Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute 
difference between any two of the chosen integers is <=1.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    static int pickingNumbers(int[] a) {
        int len = a.length;
        int max=0;
        if(len <2 || len>100)
            return 0;
        else{
            int i=0,j=0,diff=0,count=0;
            Arrays.sort(a);
            for(i=0;i<len;i++){
            	count =0;
                j=i;
                while(j < len){
                    diff = Math.abs(a[i] - a[j]);
                    if (diff <=1 ){
                        count++;
                    }
                    else{
                        break;
                    }
                    j++;
                }
                max = Math.max(max, count);
                
            }
        }
        return max;
    }

    public static void main(String[] args) {
    	 int[] a = {4,6,5,3,3,1};
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }*/
        int result = pickingNumbers(a);
        System.out.println(result);
        //in.close();
    }
}
