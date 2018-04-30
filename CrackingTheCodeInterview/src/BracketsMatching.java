import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BracketsMatching {
	
	   public static boolean isBalanced(String expression) {
	    	Stack<Character> s = new Stack<Character>();
	         int i=0, len=expression.length();
	        boolean res=false;
	        
	       if(len < 1)
	            return res;
	        else{
	            for(i=0;i<len;i++){
	            	char c = expression.charAt(i);
	                
	                if( c=='{' || (c)=='[' || (c)=='('){
	                  s.push(c);  
	                }
	                
	                if(c=='}'){
	                    if(s.empty()) return res;
	                    else{
	                    if(! (s.pop() == '{'))
	                        return res;
	                    }
	                }
	                if(c==']'){
	                     if(s.empty()) return res;
	                    else{
	                	if(! ( s.pop() == '[' ))                      
	                         return res;
	                    }
	                }
	                if( c==')'){
	                     if(s.empty()) return res;
	                    else{
	                    if(!(s.pop() == '('))
	                    	return res;
	                    }
	                }
	            }
	            if(i== len && s.isEmpty()){
	                res = true;
	            }
	          
	        }
	        return res;
	    }
  
    public static void main(String[] args) {
      //String expression ="{[()]}";
      //String expression =")]}";
      String expression ="";
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

