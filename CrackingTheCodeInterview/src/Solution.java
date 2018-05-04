import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int k=0;
        
        int[] med = new int[a.length];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
            if(i==0)
                med[k++]=a[i];
            else if( i %2 != 0){
                med[k++] = a[i /2];
            }
            else{
                med[k++] = (a[(i/2) + ((i/2)-1)])/2;
            }
        }
        for(int i=0;i<med.length;i++){
            System.out.println(med[i]);
        }
    }
}
