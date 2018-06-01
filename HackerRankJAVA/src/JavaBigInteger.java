/**
 * Hacker rank - Pravalika TIrumala
 * Refer to java-Biginteger.pdf
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        BigInteger bnum1 = new BigInteger(in.next());
        BigInteger bnum2 =new BigInteger(in.next());
        
        System.out.println(bnum1.add(bnum2));
        System.out.println(bnum1.multiply(bnum2));

    }
}