/**
 * Pravalika Tirumala
 * Hacker rank challenge
 * The Fibonacci sequence begins with fibonocci(0) and fibonocci(0) as its respective first and second terms. 
 * After these first two elements, each subsequent element is equal to the sum of the previous two elements.
 * fibonocci(n) = fibonocci(n-1)+fibonocci(n-2)

Here is the basic information you need to calculate :
 */
import java.util.*;

public class Fibonocci {

    
    public static int fibonacci(int n) {
     
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if (n>1)
            return (fibonacci(n-1)+fibonacci(n-2));
        else
            return 0;
      
}
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
