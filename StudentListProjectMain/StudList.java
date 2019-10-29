import java.util.*;
/**
 * @author (Fernando Rodriguez)
 * @version (25 October 2019)
 */
public class StudList
{
    ArrayList<Student> studList = new ArrayList<Student>();
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class StudList
     */
    public StudList()
    {
        // initialise instance variables
        x = 0;
    }
    public static String getGreeting(){
      System.out.println("To add a student type: 1");
      System.out.println("To delete a student type: 2");
      System.out.println("To print a student record a student type: 3");
      System.out.println("To search for a student type: 4");
      System.out.println("To delete all students type: 5");
      return "To leave type: Bye";
    }
    public void addStudent(String fullName){
      
    }
    public void deleteStudent(String lastName){
    
    }
}