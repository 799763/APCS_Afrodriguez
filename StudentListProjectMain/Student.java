import java.util.*;
/**
 * @author (Fernando Rodriguez)
 * @version (25 October 2019)
 */
public class Student
{   
    String fName = "";
    String mName = "";
    String lName = "";
    double GPA;
    int stuNum = 0;
    String finalName = "";
    
    public double getGPA(){
      
      return GPA;
    }
    public void setName(String fullName, int Num, double GPA){
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
      finalName = fName+" "+ mName+" "+lName;
    }
}