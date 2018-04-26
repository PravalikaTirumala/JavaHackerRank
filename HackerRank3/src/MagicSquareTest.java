import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MagicSquareTest {
 
    static int formingMagicSquare(int[][] s) {
    	
      
    	int res=0;
    	int len = s.length;
    	int k=0;
    	int []test=new int[len * len]; 
    	for(int i=0;i<len;i++){
    		for(int j=0;j<len;j++){
    		test[k++] = s[i][j];	
    		}	
    	}
    	if(test[4] != 5){
    		int val=test[4];
    		test[4]= 5;
    		res=res+ Math.abs(test[4]-val);
    	}
    	
    	int n= test.length;
    	int even[]=new int[n/2]; int e=0;
    	int odd[]=new int[n/2];int od =0;
    	
    	for(int i=0;i< (n/2);i++){
    		int j = (n - (i+1));
    		
    		if((i==0 || i%2 == 0 )&& (j%2 ==0)){
    			
    			if(test[i] %2 ==0 && test[j] %2 ==0 ){
    				//if sum is 10
    				if(test[i]+test[j] == 10){
    					even[e++] = test[i];
						even[e++] = test[j];
    				}
    				else{
    					//change arrays even and add to array lists to reduce number of loops
    					int yes=0;
    					for(int z=0;z<even.length;z++){
    						if(test[i] == even[z]){
    						yes++;	
    						}
    					}
    					if(yes ==0){
    						int val=test[j];
    						test[j]= 10-test[i];
    						even[e++] = test[i];
    						even[e++] = test[j];
    						res =res +Math.abs(test[j]-val);
    						
    					}
    					else{
    						int val=test[i];
    						test[i]= 10-test[j];
    						even[e++] = test[i];
    						even[e++] = test[j];
    						res =res +Math.abs(test[i]-val);
    						
    					}
    					//if even but sum is not 10
    				}
    			}
    			
    			if(test[i] %2 ==0 && test[j] %2 !=0){
    				// to store changing values to calculate cost
    				int val = test[j];
    				test[j] = 10-test[i];
    				even[e++] = test[i];
					even[e++] = test[j];
					res = res+ Math.abs(test[j] - val);
					
    			}
    			
    			if(test[i] %2 !=0 && test[j] %2 ==0){
    				int val = test[i];
    				test[i] = 10-test[j];
    				even[e++] = test[i];
					even[e++] = test[j];
					res =res+ Math.abs(test[i] - val);
    			}
    			
    			if(test[i] %2 !=0 && test[j] %2 !=0){
    				/*both are odd, change values to even and check for sum to be 10*/
    			}
    			
    		}
    		
    		else{
    			if(i %2 !=0){
    				if(test[i] %2 !=0 && test[j] %2 !=0 ){
        				//if sum is 10
        				if(test[i]+test[j] == 10){
        					odd[od++] = test[i];
    						odd[od++] = test[j];
        				}
        				else{
        					//if odd but sum is not 10
        					int yes=0;
        					for(int z=0;z<odd.length;z++){
        						if(test[i] == odd[z]){
        						yes++;	
        						}
        					}
        					if( yes == 0 ){
        						int val=test[j];
        						test[j]= 10-test[i];
        						odd[od++] = test[i];
        						odd[od++] = test[j];
        						res =res +Math.abs(test[j]-val);
        						
        					}
        					else{
        						int val=test[i];
        						test[i]= 10-test[j];
        						odd[od++] = test[i];
        						odd[od++] = test[j];
        						res =res +Math.abs(test[i]-val);
        						
        					}		
        				}
        			}
        			
        			if(test[i] %2 !=0 && test[j] %2 ==0){
        				int val = test[j];
        				test[j] = 10-test[i];
        				odd[od++] = test[i];
    					odd[od++] = test[j];
    					res = res+ Math.abs(test[j] - val);
        			}
        			
        			if(test[i] %2 ==0 && test[j] %2 !=0){
        				int val = test[i];
        				test[i] = 10-test[j];
        				odd[od++] = test[i];
    					odd[od++] = test[j];
    					res = res + Math.abs(test[i] - val);
        			}
        			
        			if(test[i] %2 ==0 && test[j] %2 ==0){
        				/*both are even, change values to odd and check for sum to be 10*/
        			}
    			}
    		}
    	}
        return res;
    }

    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }*/
    	// int[][] s ={{4,8,2},{4,5,7},{6,1,6}} ;
    	// int[][] s ={{4,9,2},{3,5,7},{8,1,5}} ;
    	 int[][] s ={{2,1,7},{9,9,9},{4,8,6}} ;
    	// int[][] s ={{5,3,4},{1,5,8},{6,4,2}} ;
        int result = formingMagicSquare(s);
        System.out.println(result);
        //in.close();
    }
}
