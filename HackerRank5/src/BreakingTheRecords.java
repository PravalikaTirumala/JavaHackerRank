/**
 * Breaking the records - Hacker rank challenge
 * Pravalika Tirumala
 * Refer practice challenge questions folder - breaking the record pdf
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BreakingTheRecords {

    /*
     * Complete the breakingRecords function below.
     */
    static int[] breakingRecords(int[] score) {
        int max=score[0];
        int min = score[0];
        int i=0;
       int max_count=0,min_count=0;
        for(i=1;i<score.length;i++){
                if(max < score [i]){
                    max= score[i];
                    max_count++;
                }
               if(min > score[i]){
                   min = score[i];
                   min_count++;
               }
      
    }
          int res[] = {max_count,min_count};
        return res;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
