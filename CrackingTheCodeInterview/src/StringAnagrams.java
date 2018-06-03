/**
 * Hacker ran - cracking code interview
 * Refer to Cracking code interview questions / makingAnagrams.pdf
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringAnagrams {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();

        String b = scanner.nextLine();
        if(a.length()<1 || b.length()<1)
            return;
        else if(a.equals(b))
            System.out.println("0");
        else {
            String aCopy = a;
             //toCharArray() - returns an Array of chars after converting a String into sequence of characters.
            for(char c: aCopy.toCharArray()){
                if(b.indexOf(c) != -1){ // if the character exist in b
                 /*replacing the first instance of that character with "" (an empty string).
                	   * c + "" as the first argument here because the function replaceFirst takes 
                	   * in two string parameters. c + "" casts the character c from a char to a 
                	   * string.
                	   */
                    a = a.replaceFirst(c+"" , "");
                    b = b.replaceFirst(c+"" , "");
                }
            }
             System.out.println(a.length() + b.length());
        	
        }
        scanner.close();
    }
}
