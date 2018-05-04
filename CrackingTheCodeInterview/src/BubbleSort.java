/**
 * Pravalika Tirumala
 * HAcker rank code interview challenges: Bubble sort
 * count number os swaps required to sort and reduce order of n power 2 to lesser
 * 
 */
import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count =0;
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0; i < n; i++){
        a[i] = in.nextInt();
    }
    boolean isSorted = false; int len = n-1;
    while(!isSorted){
            isSorted = true;
            for (int i=0;i<len ;i++){
                if( a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    isSorted = false;
                    count++;
                }                
            }
            len --;
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}