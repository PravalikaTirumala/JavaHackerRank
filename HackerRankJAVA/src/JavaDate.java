/**
 * Pravalika Tirumala
 * Refer to java-date-and-time.pdf 
 */
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalDate;


public class JavaDate{
	public static String getDay(String day, String month, String year){
		LocalDate ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return ld.getDayOfWeek().toString();
       
	}
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String month = in.next();
            String day = in.next();
            String year = in.next();
            
            System.out.println(getDay(day, month, year));
        }
  } 
