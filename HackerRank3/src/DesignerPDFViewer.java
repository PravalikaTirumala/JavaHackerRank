/**
 * Pravalika Tirumala
 * HackerRank challenge : Designer PDF Viewer
 * In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the 
 * letter heights given, determine the area of the rectangle highlight in mm2 assuming all letters are  
 * 1mm wide.
 * Print a single integer denoting the area in mm2 of highlighted rectangle when the given word is 
 * selected. Do not print units of measure.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {
    	 int k=0,m=0,j=0; 
         int resval=0, max=0;
       if (word.length() > 10)
           return 0;
        else{
           
            for(int i=0;i<word.length();i++){
            	j=0;
                while(j>=0 && j<h.length){
                     if(j == Math.abs(97-word.charAt(i)) ){
                      // resArr[i];
                        if(i==0)
                            max = h[j];
                         else{
                             if(h[j] > max)
                                 max = h[j];
                         }
                     }
                        
                    j++;
                }
            }
            
            resval = max * word.length();  
        }
        return resval;
    }

    public static void main(String[] args) {
      
    	 int[] h = {1 ,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    	 String word = "zaba";
        int result = designerPdfViewer(h, word);
        System.out.println(result);
       // in.close();
    }
}
