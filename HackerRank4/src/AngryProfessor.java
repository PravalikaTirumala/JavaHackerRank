/**
 * Pravalika Tirumala
 * Hacker rank challenge - angry professor
 * Given the arrival time of each student, determine if the class is canceled.
 * Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () 
 * indicate the student arrived  minutes late.  For each test case, print the word YES if the class is canceled or NO if it is not.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        String res = " ";
        if(k < 1 || k>a.length)
            return null;
        else{
            for(int i=0;i<a.length;i++){
                if(a[i] <=0)
                    k--;
                
            }
            if(k <=0)
                res = "NO";
            else
                res="YES";
            
        }
        return res;
    }

    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
       //int k=3;
    	int k=2;
     //  int []a ={-3,-1,4,2};   
       int []a ={0,-1,-2,1};   
            String result = angryProfessor(k, a);
            System.out.println(result);
    }
       // in.close();
    
}
