import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
 
       
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        
        /*public Locale(String language, String country) : it is constructor for creating Locale            object which takes language and country code as a parameter.
        India's country code in the IANA Language Subtag Registry */
        
        Locale indLoc = new  Locale("en","IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indLoc);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}