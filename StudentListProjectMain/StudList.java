import java.util.*;
/**
 * @author (Fernando Rodriguez)
 * @version (25 October 2019)
 */
public class StudList
{
    ArrayList<Student> studList = new ArrayList<Student>();
    Scanner Ans = new Scanner(System.in);
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
      return "To leave type: Quit";
    }
    /*
     * NOTE TO SELF: Find a way to assign a student ID# and GPA for every name 
     */
    public void addStudent(String fullName, int Num, double GPA){
      System.out.print("Enter a student #, GPA, and Name");
      //++++++++++++++++++++++++++++++++++
      String fName = "";
      String mName = "";
      String lName = "";
      String finalName = "";
      int stuNum = 0;
      double stuGPA = 0.0;
      //++++++++++++++++++++++++++++++++++
      int Comma = fullName.indexOf(",");
      int Space = fullName.indexOf(" ");
      //++++++++++++++++++++++++++++++++++
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
      finalName = fName+" "+ mName+" "+lName;
      for(int i = 0; i < studList.size(); i++){
         studList[i].stuGPA = 0;
      }
      Student.setName(fullName);
      //stuGPA = Ans.nextDouble();
      //System.out.print(finalName); // test to see if it worked (Can delete later if it does)
    }
    public void deleteStudent(String lastName){//Complete (I think)
      for(int i = 0; i < studList.size(); i++){
        int Spot = studList.indexOf(i);
        if(studList.get(i).equals(lastName)){
          studList.remove(i);
        }
      }      
    }    
    public void deleteStudent(int stuNum){
       for(int i = 0; i < studList.size(); i++){
           //Once found a way to assign students a #, come back to this
       } 
    }
    public void editList(int stuNum){
      
    }
    public void editList(String lName){
      
    }
    public void clearList(){//Complete (I think)
      for(int i = 0; i < studList.size(); i++){
        studList.clear();
      }    
    }
    public void printList(){//Complete (I think)
      System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      System.out.print(" ");
      System.out.print(studList);
      System.out.print(" ");
      System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    public void printStudent(String lastName){
    
    }
    public void printStudent(int stuNumber){
    
    }
    public void SortStudents(String lastName){
    
    }
    public void SortStudents(int stuNumber){
    
    }
}
