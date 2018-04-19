
/**
 * Given an array of integers, find the sum of its elements.
 * 
 * Pravalika Tirumala
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum{

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
       int sum=0;
        for(int i=0;i<ar.length;i++){		
           sum=sum+ar[i];
       }
    return sum;
    }

    

    public static void main(String[] args) throws IOException {
        
     //   int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = {2,5,6,1,3,4,5};
        int result = simpleArraySum(ar);
        System.out.println(result);
    }
}
