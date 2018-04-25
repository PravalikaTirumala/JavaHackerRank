import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MagicSquare {
 
    static int formingMagicSquare(int[][] s) {
      
    	int []test=new int[s.length * s.length];
    	
    	int i=0,count =0,j=0;int res=0;
        int n=s.length;
      //  for(i=0;i<n/2;){
            j=(n- (i+1));
            int one =i;
            int two=j; 
            while(one <3 && two >= 0){
                if(count ==0 || count ==2){
                    if(s[i][one] % 2 ==0){
                        if(s[j][two] %2 ==0){
                            if(s[i][one] + s[j][two] == 10){
                            	//test[s[i][one] -1]= s[i][one];
                            	//test[s[j][two] -1]= s[j][two];
                            	one++; two--;count ++;
                                continue;
                            }
                        }
                        else{
                        s[j][two] = 10 - s[i][one] ; 
                        
                            res=res+1;
                        }
                    }
                    else{
                        if(s[j][two] %2 ==0){
                        s[i][one] = 10 - s[j][two] ;
                        res=res+1;
                        }
                    
                    }
                    one++; two--; count ++;
                }
                else{
                    if(s[i][one] %2 !=0){
                        if(s[j][two] %2 !=0){
                          if(s[i][one]+ s[j][two] == 10){
                        	  one++; two--;count++;
                              continue;
                          } 
                        }
                        else{
                           s[j][two] = 10 - s[i][one] ; 
                           res=res+1;
                        }
                    }
                    else{
                        if(s[j][two] %2 ==0){
                           s[j][two] = 10 - s[i][one] ; 
                           res=res+1;
                        }
                        else{
                        	s[i][one] = 10-s[j][two];
                        	res =res+1;
                        }
                    }
                   one++; two--; count ++; 
                }
            }
            
           // j = j-1;
            if(count %2 !=0){
            
            	
            	if(s[i+1][i] %2 !=0){
                    if(s[i+1][j] %2 ==0){
                    	 s[i+1][j] = 10 - s[i+1][i] ;
                    	 res=res+1;
                    }
                }
            	if(s[i+1][i] %2 ==0){
                    if(s[i+1][j] %2 !=0){
                    	 s[i+1][i] = 10 - s[i+1][j] ;
                    	 res=res+1;
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
    	 int[][] s ={{4,8,2},{4,5,7},{6,1,6}} ;
        int result = formingMagicSquare(s);
        System.out.println(result);
        //in.close();
    }
}
