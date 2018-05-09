//Pravalika Tirumala
/**
 * Refer to Java Hacker Rank JavaPRacticeQuestions: Loop2
 */
import java.util.*;
import java.io.*;

class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=0;
            for(int j=0;j<n;j++){
                if(j==0)
                res = res+ (a+ (int)(Math.pow(2,j)*b));
                else
                res = res+ (int)(Math.pow(2,j)*b) ;
                
                System.out.print(res+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
