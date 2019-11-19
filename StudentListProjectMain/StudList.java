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
    /*
     * NOTE TO SELF: Find a way to assign a student ID# and GPA for every name 
     */
    public void addStudent(String fullName, int Num, double GPA){
  
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
    public void clearList(){//Complete (I think)
      studList.clear();    
      System.out.print("List cleared");
    }
    public void printList(){//Complete (I think)
      System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      System.out.print(" ");
      System.out.print(studList);
      System.out.print(" ");
      System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    /**
     * should search for a student by number and print that student
     */
    public void printStudent(int stuNumber){
    
    }
}
