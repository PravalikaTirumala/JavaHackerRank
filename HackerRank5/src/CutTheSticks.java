import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        int i=0,j=0,count=0,min=0,k=0;
        Arrays.sort(arr);
        System.out.println(arr.length);
    
         ArrayList <Integer> res = new ArrayList<>();
        for(i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                res.add(arr.length -i);
            }
        }   
        int resarr[] = new int [res.size()];
        for(int m=0;m<resarr.length;m++){
        resarr[m]=res.get(m);
    }
       
        return resarr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
