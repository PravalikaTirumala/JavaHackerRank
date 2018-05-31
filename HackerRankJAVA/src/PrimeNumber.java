/**
 * Hacker rank challenge 
 * Pravalika Tirumala
 * Refer to java-primarily-test.pdf
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrimeNumber {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // String n = scanner.nextLine();
         BigInteger a=new BigInteger(scanner.nextLine());
         /* public boolean isProbablePrime(int certainty)
        certainty − a measure of the uncertainty that the caller is willing to tolerate:
        if the call returns true the probability that this BigInteger is prime exceeds (1 -                 1/2certainty).*/
         System.out.println(a.isProbablePrime(1) ? "prime" :"not prime");
       
        scanner.close();
    }
}
