import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int n= keyboards.length;
        int m=drives.length;
        int req=0,i=0;
        if(n<1 || m<1 || b<1) return 0;
        else{
           
            for(i=0;i<n;i++){
            	 int j=0;
                while (j<m){
                    if( (keyboards[i]+drives[j]) <= b ){
                      
                                if( (keyboards[i]+drives[j]) > req)
                                    req = keyboards[i]+drives[j];
                            
                    }
                    j++;
                }
            }
        }
        if(i==n && req ==0){
        	req = -1;
        }
        return req;

    }

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	System.out.println("enter her budget");
    	int budget = in.nextInt();
    	
    	System.out.println("enter number of KB's");
    	int kb = in.nextInt();
    	int[] keyboards = new int[kb];
    	
    	System.out.println("enter number of drives");
        int dri = in.nextInt();
        int[] drives= new int[dri];
        
        System.out.println("enter KB prices");
        for(int i=0;i<kb;i++){
        	keyboards[i]=in.nextInt();
        }
        
        System.out.println("enter drive prices");
        for(int i=0;i<dri;i++){
        	drives[i]=in.nextInt();
        }
        
        //method call to calculate the amount she can spend
        int moneySpent = getMoneySpent(keyboards, drives, budget);
        System.out.println(moneySpent);

        in.close();
    }
}
