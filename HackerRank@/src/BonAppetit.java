/**
 * Pravalika Tirumala
 * 
 * Hacker Rank challenge - Bon Appetit:
 * You are given an array of prices,bill , the cost of each of the n items, k , the item Anna doesn't eat, and b , 
 * the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split,
 *  print Bon Appetit. Otherwise, print the integer amount of money that Brian must refund to Anna.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {
    public static void main(String args[] ) throws Exception {
       Scanner in = new Scanner(System.in);
        //number of elements
        int n = in.nextInt();
        //index of the price that anna doesnt have to pay for
        int k = in.nextInt();
        int [] ar = new int [n] ;
        //enter prices of items
        for(int i=0; i<n;i++)
            ar[i] = in.nextInt();
        //enter the amount Brain has charged to Anna
        int b = in.nextInt();
        if(n <2 )System.out.println("n can not be less than 2");
        else if( k<0) System.out.println("k can not be less than 0");
        else if(b <0) System.out.println("b can not be less than 0");
        
        else{
        	int sum=0;
        for(int i=0;i<n;i++){
            if(ar[i] <0) System.out.println("0");
            else{
                if(i != k)
                    sum =sum + ar[i];
            }
        }
        if( b == sum/2)
            System.out.println("Bon Appetit");
        if( b > sum/2)
            System.out.println((b-(sum/2)));
    
    }
    }
}