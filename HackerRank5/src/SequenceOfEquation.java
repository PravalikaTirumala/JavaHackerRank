/**
 * Pravalika Tirumala
 * Refer to permutation-equation.pdf for the question
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceOfEquation {

    // Complete the permutationEquation function below.
        static int[] permutationEquation(int[] p) {
       ArrayList<Integer> ar = new ArrayList<Integer>(); 
        for(int i=0;i< p.length;i++) {
        	ar.add(p[i]);
        }
         int[] res = new int[ar.size()]; 
        for(int i=0; i < ar.size();i++){
        	res[i] =  (ar.indexOf( ((ar.indexOf(i+1)+1)))+1);
        	//System.out.println(ar.indexOf((ar.indexOf(i+1)+1) +1));
        }
        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
