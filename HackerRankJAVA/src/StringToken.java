/**
 * Pravalika Tirumala
 * Hacker rank challenge - StringToken
 * Refer to java_string_tokens.pdf
 */
import java.io.*;
import java.util.*;

public class StringToken {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); 
        
        s=s.trim();
        /*trim() - eliminates leading and trailing spaces. The Unicode value of space character is  '\u0020'. 
         * The trim() method in java checks this Unicode value before and after the string, if it exists then
         *  removes the spaces and returns the omitted string.*/
        if(s.length() < 1)
            System.out.println("0");
       else if(s.length() > 400000){
           System.out.println("0");
       }
      
        else{
            /*  Quantifiers
    		0 or more  *  
    		1 or more  +
    		0 or 1     ? 
    		String length = s.length()
    		array length = a.length*/
        	
             String delimiters = "[ .,?!'_@]+"; 
             String[] words = s.split(delimiters);
             System.out.println(words.length);
             for(int i=0;i<words.length;i++){
                System.out.println(words[i]);
             }
        }
        scan.close();
    }
}

