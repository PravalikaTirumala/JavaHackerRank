/**
 * HAcker rank challenge - calculating factorial using BigInteger class
 * Refer practice questions folder -ExtraLong factorial pdf
 * Pravalika Tirumala
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialBigInteger {

    static void extraLongFactorials(int n) {
        //BigInteger class is used to represent arbitrarily large numbers.
        // A BigInteger object is created by passing a String which contains an integer value.
       BigInteger res = new BigInteger("1");
        for(int i =1;i <=n;i++){
            //BigInteger class is immuatable like String
            res = res.multiply(new BigInteger(i+""));
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
