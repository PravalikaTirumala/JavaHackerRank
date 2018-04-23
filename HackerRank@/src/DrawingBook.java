/**
 * Pravalika Tirumala
 * Hacker rank challenge : Given  n and p , find and print the minimum number of pages Brie must turn in order
 *  to arrive at page p .
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
                        
        int req=0;
        if(n <1 || p<1 || p>n) return -1;
        else{
            
            int half = n/2;
            if(p ==1)return 0;
            
           
            else if(n%2 !=0 && ((p==n) || (p==(n-1)))){
                    return 0;
            }
            else if(n%2 ==0 && ((p ==n) || (p==(n-1)))){
               if(p==n)
            	return 0;
               else return 1;
            }
            else if( p <= half){
                //if(p%2 == 0 )
                 req=  (p/2); 
                //else
                  // req=  (1 + (n-p) );   
            } 
            else {
                
               // if(n%2 == 0 )
                 req=  ((n-p)/2); 
              //  if(n %2 !=0)
                //   req=  (((n-p)/2) - 1);   
            }

        }
        return req;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
     //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);
        System.out.println(result);
    //    bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
