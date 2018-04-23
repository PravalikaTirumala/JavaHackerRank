/**
 * @author PravalikaTirumala
 *HackerRank challenge - Migratory Birds
 *Print the type number of the most common bird; if two or more types of birds are equally common, choose the
 * type with the smallest ID number.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

	   static int migratoryBirds(int n, int[] ar) {
	        int val=0,fin_val=0,fin_count=0;
	        if(n<5) return 0;
	        else{
	            
	            for(int i=0;i<ar.length;i++){
	                if(ar[i]<1 && ar[i] > 5) return 0;
	                else{
	                    int j= i+1,count=1;
	                    val= ar[i];
	                    if(val != -1){
	                        while(j < ar.length){
	                            if(ar[i] == ar[j]){
	                              count++;
	                                ar[j] = -1;
	                            }
	                            j++;
	                        }
	                        if(count > fin_count){
	                        	fin_count = count;
	                        	 fin_val = val;
	                        }
	                        
	                    }
	                }
	            }
	           
	        }
	        return fin_val;
	    }

    public static void main(String[] args) {
    	 int n = 6;
         int[] s = {1,4,4,4,5,3};
        
   
        int result = migratoryBirds(n, s);
        System.out.println(result);
    }
}
