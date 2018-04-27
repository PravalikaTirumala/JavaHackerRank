import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class NonDivisibleSum {

    /*
     * Complete the nonDivisibleSubset function below.
     */
    static int nonDivisibleSubset(int k, int[] S) {
       int n= S.length,j=0;
      
        ArrayList <Integer > arr= new ArrayList<Integer>();
        if(n< 1|| k <1)
            return 0;
        else{
            
           
            for(int i=0;i<n;i++){
               if(S[i] <1)
                   return 0;
                else{ 
                     j=i+1;
                    //if(!arr.contains(S[i]))
                    //arr.add(S[i]);
                    while(j<n){
                        if( (S[i]+S[j])%k !=0){
                           if(!arr.contains(S[j]))
                            arr.add(S[j]);
                           if(!arr.contains(S[i]))
                               arr.add(S[i]);
                    }
                        j++;
                }
                }
            }
        }
       
        return arr.size();
            }
   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
    	int m[] = {1,7,2,4};
    	int k=3;
        int result = nonDivisibleSubset(k, m);
        System.out.println(result);
       
    }
}
