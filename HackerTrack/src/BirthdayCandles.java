/**
 *  Hacker rank challenge solution : Complete the function birthdayCakeCandles that 
 *  takes your niece's age and an integer array containing height of each candle as 
 *  input, and return the number of candles she can successfully blow out.
 * 
 * pravalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BirthdayCandles {
    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
       int max=0,index=0,counter=1;
        for(int i =0; i< n;i++){
           if( ar[i] > max){
               max = ar[i];
               index =i;
           }
            if(( ar[i] == max) && (index != i)){
                counter++;
            }
         }
        return counter;
    }


    public static void main(String[] args) throws IOException {
    	
    	int []arr = {3,2,1,3};
    	int a = birthdayCakeCandles(4,arr);
    	System.out.println(a);
    	
    }
}