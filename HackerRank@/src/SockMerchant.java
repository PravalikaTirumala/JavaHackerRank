/**
 * Pravalika Tirumala
 * 
 * HackerRank challenge - Sock merchant:
 * Print the total number of matching pairs of socks given number of colors (array), each number 
 * representing a color.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {
	
    static int sockMerchant(int n, int[] ar) {
    	 int fin_pairs=0 ;
    	//SockMerchant sm;
        if((n < 1) || (n==1) || (n >100) )
            return 0;
        else {
        	int pairs=0; 
        	boolean [] visited = new boolean[n];
            for(int i=0;i<n;i++){
                if((ar[i] <1) || (ar[i] >100))
                    return 0;
                else{
                	pairs=0;
                	int j= i+1, count=1;
                    if(visited[i] != true){
                    	
                    	while(j < n){
                    		if(ar[i] == ar[j]){
                    			count = count+1; 
                    			visited[j] = true;
                    		}
                    		j++;
                    	}
                    	if(count %2 ==0)
                        pairs = count /2 ;
                    	//	sm.fin_pairs = sm.fin_pairs + pairs;
                    	else
                    		pairs = (count -1) /2;
                    	// sm.fin_pairs = sm.fin_pairs + pairs;
                    	
                  
                    }
                    
                }
                fin_pairs = fin_pairs + pairs;
            }
            
        }
        return fin_pairs ;  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
