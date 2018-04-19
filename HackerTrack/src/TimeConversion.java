/**
 *  Hacker rank challenge solution: Convert given 12 hours time in to 24 hours
 * pravalika Tirumala
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    if(s.charAt(8) == 'A'){
        if(s.substring(0,2).equals("12")){
            s= "00"+s.substring(2,8);
        } 
        else{
           s=s.substring(0,8); 
        }
    }
    else{
    	if(s.charAt(8) == 'P'){
    
       if((s.substring(0,2)).equals("12")) {
            s=s.substring(0,8); 
        } 
        else{
            int hour = Integer.parseInt(s.substring(0,2))+ 12;
           s= hour+s.substring(2,8);
        } 
    } 
    }
    return s;
    }
    
    public static void main(String [] args) throws IOException{
    	
    	//String time_t = "12:00:00AM";
    	//String time_t = "12:00:00PM";
    	String time_t = "07:05:45PM";
    	//String time_t = "07:05:45AM";
    	//String res = timeConversion(time_t);
    	System.out.println(timeConversion(time_t));
    	
    }
}