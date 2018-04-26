/**
 * Pravalika Tirumala
 * 
 * Hacker Rank challenge: The Hurdle Race:
 * Given an array of hurdle heights height , and an initial maximum height Dan can jump, k , determine the 
 * minimum number of doses Dan must take to be able to clear all the hurdles in the race. Print an integer 
 * denoting the minimum doses of magic potion Dan must drink to complete the hurdle race.
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max=0,j=0,res=0;
       if(k>100)
           return 0;
        else{
            max= height[0];
            for(int i=1;i<height.length;i++){
                if(height[i] <1 || height[i] >100)
                    return 0;
                else{
                    if(height[i] > max)
                        max = height[i];
                }
            }
            if(k < max)
               res = max-k;
           // else
             //   res=0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
