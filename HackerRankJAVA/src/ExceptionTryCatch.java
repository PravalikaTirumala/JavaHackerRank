/**
 * Pravalika Tirumala
 * Hacker rank java practice challenges
 * refer to java-exception-handling-try-catch.pdf
 */
import java.io.*;
import java.util.*;

public class ExceptionTryCatch {
private static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
       try{
        int x= in.nextInt();
        int y= in.nextInt();
        System.out.println(x/y);
       }
        catch(InputMismatchException e){
          System.out.println(e.getClass().getName());  
        }
        catch(ArithmeticException e){
           System.out.println(e.getClass().getName()+ ": / by zero");
        }
        
    }
}