/**
 * Pravalika Tirumala
 * Hacker rank challnege - String reverse
 * Refer to palindrome.pdf
 */
import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       if(A.length() == 1)
           System.out.println("Yes");
      
        else if( A.length() >1 || A.length()<= 50 ){
                int mid =0;
                mid = A.length()/2;
                boolean check = false;
            for(int i=0;i<mid;i++){
                if(A.charAt(i) != (A.charAt(A.length()-(i+1)))){
                 System.out.println("No");
                    break;
                }
                else
                    check = true;
            }
            if(check == true)
                System.out.println("Yes");
         }
        else{
           System.out.println("No"); 
        }
        sc.close();
    }
}



