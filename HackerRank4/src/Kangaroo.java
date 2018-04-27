import java.io.*;
import java.util.*;
/**
 * Pravalika Tirumala
 * Hacker rank challenge - Kanagaroo
 * Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and return YES
 *  or NO appropriately. Can you determine if the kangaroos will ever land at the same location at the same time? 
 *  The two kangaroos must land at the same location after making the same number of jumps.
 */
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
         String res="";
    if ( v2 >= v1) {
            res="NO";
        } 
    else {
        //time =distance/speed, if the avg time is 0 then they can meet
            if ((x2 - x1) % (v1 - v2) == 0) {
               res="YES";
            } else {
                res="NO";
            }
        }
    return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
