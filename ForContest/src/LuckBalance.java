import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckBalance {

    static int luckBalance(int n, int k, int[][] contests) {
        ArrayList <Integer >a =new ArrayList <Integer> ();
        int sum=0,count=0,luck=0;
        if(n <1 || k<0)
            return 0;
        else{
            for(int i=0;i<n;i++){
                if(contests[i][1] == 1){
                    count++;
                    a.add(contests[i][0]);
                }
                sum = sum+ contests[i][0];
            }
            
            Collections.sort(a);
            
            if(count <= k)
                luck = sum;
            if(count > k){
                int diff = count-k;
                int m=0;
                while(diff>0){
                    sum=sum - (2*a.get(m++));
                    diff=diff-1;
                }
                luck =sum;
            }
        }
        return luck;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int k = 3;
        int[][] contests = {{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
        
        int result = luckBalance(n, k, contests);
        System.out.println(result);
        in.close();
    }
}
