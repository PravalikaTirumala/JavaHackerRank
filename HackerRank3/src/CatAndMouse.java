import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CatAndMouse {


    /*
     * Complete the catAndMouse function below.
     */
    static String catAndMouse(int x, int y, int z) {
        String res=" ";
        if(x<1 || y<1 || z<1 || x>100 || y>100 || z>100 )
            res = null;
        else{
            if(Math.abs(x-z) < Math.abs(y-z))
                res="Cat A";
            else if (Math.abs(x-z) > Math.abs(y-z))
                res = "Cat B";
            else
                res = "Mouse C";
        }
        return res;
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	System.out.println("enter q");
        int q = scan.nextInt();
int x=0,y=0,z=0;
System.out.println("enter x y z");
        for (int qItr = 0; qItr < q; qItr++) {
          
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            String result = catAndMouse(x, y, z);
            System.out.println(result);

        }
            
            scan.close();
          
        }

       
    }

