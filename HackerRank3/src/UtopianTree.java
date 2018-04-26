/**
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its
 *  height increases by 1 meter. Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. 
 *  How tall will her tree be after n growth cycles?
 * 
 * Pravalika Tirumala
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    static int utopianTree(int n) {
        int reqH =1;
        if(n <0 || n>60)
            return 0;
        else{
            if(n ==0)
              return reqH;
            else if(n ==1)
                reqH = 2;
            else{
                int i=1;
                while(i<=n){
                    if(i%2 ==0)
                       reqH=reqH+1; 
                    
                    else
                        reqH=2*reqH;
                    i++;
                }
            }
        }
        return reqH;
                
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter test cases");
        int t = in.nextInt();
      
    	for(int i=0;i<3;i++){
    		 int n = in.nextInt();
             int result = utopianTree(n);
             System.out.println(result);
    	}
            
 
        in.close();
    }
}
