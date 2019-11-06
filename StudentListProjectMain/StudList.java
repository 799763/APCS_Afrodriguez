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
      String fName = "";
      String mName = "";
      String lName = "";
      String finalName = "";
      int Comma = fullName.indexOf(",");
      int Space = fullName.indexOf(" ");
      if(fullName.indexOf(",") != -1){// determines if it is 1/2     
        if(fullName.indexOf(" ") == -1){// determines if it is 1       
          fName = fullName.substring(Comma + 1);
          lName = fullName.substring(0, Comma);
        }
        if(fullName.indexOf(" ") != -1){// determines if it is 2
          fName = fullName.substring(Comma + 1, Space);
          mName = fullName.substring(Space + 1);
          lName = fullName.substring(0, Comma);
        }
      }
      if(fullName.indexOf(",") == -1){//determines if it is 3/4
        if(fullName.lastIndexOf(Space) == -1){//determines if it is 3
          fName = fullName.substring(0, Space);
          lName = fullName.substring(Space + 1);
        }
        if(fullName.lastIndexOf(Space) != -1){//determines if it is 4
          fName = fullName.substring(0, Space);
          mName = fullName.substring(Space + 1, fullName.lastIndexOf(Space));
          lName = fullName.substring(fullName.lastIndexOf(Space));
        }
      }
      finalName = fName + mName + lName;
    }
    public void deleteStudent(String lastName){
      for(int i = 0; i < studList.size(); i++){
        int Spt = studList.get(i); // in progress (change)
        if(studList.get(i) != lastName){} // in progress (change)
      }      
    }
}