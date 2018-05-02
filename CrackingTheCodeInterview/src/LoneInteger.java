import java.io.*;
/**
 * Pravalika Tirumala
 * Question : refer to code interview questions folder - Lone Integer
 * Print the unique number that occurs only once in  on a new line.
 */
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoneInteger {
    
    public static int lonelyInteger(int[] a) {
      int n=  a.length;
        int res=0;
        if(n%2==0)
            return 0;
        else{
            for(int i=0;i<n;i++){
                if(a[i] <0 || a[i]>100)
                    return 0;
                else
               res = res ^ a[i]; 
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
