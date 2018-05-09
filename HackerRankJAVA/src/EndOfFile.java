/**
 * Pravalika Tirumala
 * Hacker Rank Java
 * Refer to Java PRactice questions folder
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        int i = 1;
        while(in.hasNext()){
            System.out.println(i+ " "+in.nextLine());
            i++;
        }
        in.close();
    }
}
