/**
 * 
 * @author Pravalika Tirumala
 * Hacker rank challenge : Counting Valley: Given Gary's sequence of up and down steps during his last hike, 
 * find and print the number of valleys he walked through. For example, if Gary's path is s =(DDUUUUDD), he first enters a 
 * valley 2 units deep. Then he climbs out an up onto a mountain  2 units high. Finally, he returns to sea level
 *  and ends his hike. Print a single integer denoting the number of valleys Gary walked through during his
 *   hike.
 * 
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValley {

    static int countingValleys(int n, String s) {
        int count=0,fin_count=0;
        boolean check=false;
        ArrayList <Integer > arl =new ArrayList <Integer>(); 
        if(n <2)return 0;
        else{
       
        
        	for(int i=0;i<s.length();i++){
        		if( !( s.charAt(i) == 'D') && !(s.charAt(i) == 'U') )
                return 0;
        		else{
        			if(s.charAt(i) == 'D'){
        				count =count -1 ;
        				/*if(count <0){
        					check=true;
        					arl.add( true);
        				}*/
        				arl.add(count);
        				          
        			}
        			if(s.charAt(i) == 'U'){
        				count =count +1 ;
        				/*if(count <0){
        					check=true;
        					arl.add( true);
        				}*/
        				
        				arl.add(count); 
        			}
        		}
        	}
        }
       for(int i=0;i<arl.size();i++){
    	   if(arl.get(i) <0 && arl.get(i+1)==0)
        	fin_count ++;
        }
        return fin_count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
