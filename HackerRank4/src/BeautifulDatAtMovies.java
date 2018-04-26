/**
 * Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. 
 * Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it 
 * is a beautiful day. Print the number of beautiful days in the range.
 * Pravalika Tirumala
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDatAtMovies {

    static int beautifulDays(int i, int j, int k) {
        int res=0;
        if(i > j || i<1 || k<1)
            return 0;
        else{ 
            int lastDig=0;int rev=0;
            for(int a=i; a<=j;a++){
                 int b=a;
                 rev=0;
                while(b != 0){
               
                rev =(10*rev)+ (b%10);
                b = b/10;
                }
                if(Math.abs(a-rev) % k ==0)
                    res++;
            }
                
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
