/**
 * Pravalika Tirumala
 * Refer to Java HAcker rank Java Practice questions - Multiples
 */
import java.io.*;
import java.util.*;

public class Multiples{

    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        if(N <2 || N >20)
            System.out.println("0");
        else{
            for(int i=1;i<=10;i++){
                System.out.println(N+" * "+i+" = "+N*i);
            }
        }
    }
}