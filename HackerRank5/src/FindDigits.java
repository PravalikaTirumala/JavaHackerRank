/**
 * Pravalika TIrumala
 * HAcker rank challenge - Finding the digits
 * Refer to practice hacker rank questions 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    static int findDigits(int n) {
       int num =n; int lastDig=0,count=0;
        while(num!=0){
            lastDig = num%10;
            if(lastDig != 0){
                if(n % lastDig ==0 )
                count++;
            }
            num = num /10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
