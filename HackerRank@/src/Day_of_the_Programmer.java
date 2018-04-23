/**
 * Pravalika Tirumala
 * 
 * HackerRank challenge : Day_of_the_Programmer
 * Given a year,y , find the date of the  256th day of that year according to the official Russian calendar during
 *  that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit 
 *  month, and yyyy is y .
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_of_the_Programmer {

    static String solve(int year){
        int programmer_day = 256;
    	String res = " ";
        if(year < 1700 && year > 2700){
           res = "00:00:0000"; 
        }
        else{
        	int day =0;
            int non_leap_till_aug = 31+28+31+30+31+30+31+31;
            int leap_till_aug = 31+29+31+30+31+30+31+31;
            int year_1918_till_june = 32+14+31+30+31+30+31+31;
            
            if(year == 1918){
            	day = (programmer_day - year_1918_till_june );
            	res = day+".09."+year;
            }
            else if(year < 1918){
                if(year % 4 ==0){
                	day = (programmer_day - leap_till_aug );
                	res = day+".09."+year;
                }
                else{
                	day = (programmer_day - non_leap_till_aug );
                	res = day+".09."+year;
                }
            }
          //if(year > 1918){
            else{
            	if((year % 400 ==0) || (year % 4 ==0) && (year % 100 !=0)){
                	day = (programmer_day - leap_till_aug );
                	res = day+".09."+year;
                }
            	else{
            		day = (programmer_day - non_leap_till_aug );
                	res = day+".09."+year;
            	}
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
