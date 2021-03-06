/**
 * Hacker rank - Pravalika Tirumala
 * Refer to java-sort.pdf
 */
import java.util.*;

class Student implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int compareTo(Object o){
        Student s=(Student)o;             
        if(this.getCgpa()==s.cgpa){
            if(this.getFname().equals(s.fname)){
                return getId()-s.id;
            }else{
                return getFname().compareTo(s.fname);
            }
        }else{
            if(s.cgpa-getCgpa()>0)
                return 1;
            else 
                return -1;
        }
    }

}


//Complete the code
public class JavaComparableSort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();

         Student st = new Student(id, fname, cgpa);
         studentList.add(st);

         testCases--;
      }
      Collections.sort(studentList);
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}