/**
 * Pravalika Tirumala
 * Hacker rank java practice challenges
 * refer to java-exception-handling.pdf
 */

import java.util.Scanner;

class MyCalculator {
    private static long res;
    public static Long power(int n, int p) throws Exception {
       /*creating own exception classes
        we need to catch or throw the exception (throws exception) */
        
        if(n<0 || p<0){
          throw new Exception ("n or p should not be negative."); 
        }
        else if(n==0 && p==0){
           throw new Exception ("n and p should not be zero."); 
        }
        else{
             res =(long) Math.pow(n,p);
        }
        return res;
    }
}

public class ExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}