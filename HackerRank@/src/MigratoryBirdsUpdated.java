/**
 * 
 * @author Pravalika Tirumala
 * HackerRank challenge - Migratory Birds
 * Print the type number of the most common bird; if two or more types of birds are equally common, choose the
 * type with the smallest ID number.
 *
 */
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirdsUpdated{

  	   static int migratoryBirds(int n, int[] ar) {
	        int val=0,fin_val=0,count,fin_count=0;
	        if(n<5) return 0;
	        else{
	            Arrays.sort(ar);
	            for(int i=0;i<ar.length;i++){
	                if(ar[i]<1 && ar[i] > 5) return 0;
	                else{
	                    int j=i+1;count =1;
	                   while( j<ar.length && ar[i]==ar[j]   ) {
	                   count++;
	                   j++;
	                   }
	                 if(count > fin_count){
	                  fin_count =count;
	                  fin_val = ar[i];
	                 }
	                
	            }
	            }
	            if(fin_count ==1) fin_val = ar[0];
	        }
	        return fin_val;
	   }
	   

	     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
