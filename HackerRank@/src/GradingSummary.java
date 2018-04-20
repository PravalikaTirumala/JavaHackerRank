
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingSummary{

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
       int pass=40,rem=0;
    for(int i=0; i<grades.length;i++){
        if(grades[i] < pass){
            if((pass - grades[i]) < 3 )
                grades[i] = pass;
        }
        else {
            rem = grades[i]%5 ; 
              if(rem !=0){
                if(( (grades[i]+ (5 - rem)) - grades[i]) < 3)
                    grades[i] = (grades[i]+ (5 - rem ));
                else
                    grades[i] = grades[i];
            }
               
        }
    }
return grades;
    

    }

    
    public static void main(String[] args) throws IOException {
       
        int[] grades = {4,73,67,38,33};
        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
           System.out.println(result[resultItr]);
        }

      
    }
}
