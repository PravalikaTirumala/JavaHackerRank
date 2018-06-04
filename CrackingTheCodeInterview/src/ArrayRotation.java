/**
 * Hacker rank coding interview challenge
 * Refer to Coding Interview Questions / ArrayRotation.pdf
 * Pravalika Tirumala
 * 
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    
    int resIndex =0;
    int len = a.length;
    int resArray[] = new int[len];

   
    if(d ==0 || d>len)
    return a;
    
    else{
       for(int i=0;i<len;i++){
          /* resIndex = i+d;
           if(resIndex >= len)
               resArray[i] = a[resIndex - len ]; 
             else
               resArray[i] = a[resIndex];*/
           
           resArray[i] = a[(i+d)%len] ;
         
      } 
    }
return resArray;
    }

    

    public static void main(String[] args) throws IOException {
       int a1[] = {1,2,3,4,5};
       int rot = 2;
    	int res[] = rotLeft(a1,rot);
    	
    	for(int i=0;i<res.length;i++) {
    		System.out.println(res[i]);
    	}
    }
}
