/**
Pravalika Tirumala
Hacker rank challenge - java regex
Refer to java_regex.pdf
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//Write your code here
 class MyRegex{
   /* \\d{1,2} | (0/1)\\d{2} | 2[0,4]\\d | 25[0,5]
   
   d{1,2} - 1 or 2 digits number
   (0/1)\\d{2} - starts with 0 or 1, followed by 2 digit number
   2[0,4]\\d - starts with 2, 2nd digit is 0 to 4 and 3 rd digit is anyone from 0 to 9 (200 - 249)
   25[0,5] - starts with 25 followed by 0 to 5 digits (250 to 255)
   Should not be any space in between 
   */
    /*
    ([0-9] | [0-9][0-9] | [0-1][0-9][0-9] | [0-2][0-4][0-9] | [2][5][0-5])
    1 digit or 2 digits or 3 digits(100 - 199) or 3 digits(200 to 249) or 3 digits(250 to 255)
    */
   
   // String constraint = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
  
   String constraint = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[0-2][0-4][0-9]|[2][5][0-5])";
    public String pattern = constraint + "."+ constraint +"."+ constraint +"."+ constraint;
    
    
}