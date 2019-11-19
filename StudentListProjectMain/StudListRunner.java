import java.util.Scanner;
/**
 * @author (Fernando Rodriguez)
 * @version (25 October 2019)
 */
public class StudListRunner
{
    public void main(String args[]){
      StudList studList = new StudList();
    }
    StudList studList = new StudList();
    public StudListRunner(){
      Scanner Scn = new Scanner(System.in);
      String statement = Scn.nextLine();     
      while (!statement.equals("6")){
          System.out.println(" ");
          System.out.println("To add a student type: 1");
          System.out.println("To delete a student type: 2");
          System.out.println("To print a student record a student type: 3");
          System.out.println("To search for a student type: 4");
          System.out.println("To clear the list type: 5");
          System.out.println("To print the list type: 6");
          System.out.println("To ___ type: 7");
          System.out.println("To ___ type: 8");
          
      }
      System.out.print("You have quit the program");
      if(statement != "6"){
          String Statement = Scn.nextLine();
          if(Scn.nextInt() == 1){//should add a student
            double GPA = 0.0;
            int stuNum = 0;
            String FullN = "";
            System.out.print("Enter the students number");
            stuNum = Scn.nextInt();
            System.out.print("Enter the students GPA");
            GPA = Scn.nextDouble();
            System.out.print("Enter the students name");
            //How sould I get the students name?
            studList.addStudent(FullN, stuNum, GPA);
          }
          if(Scn.nextInt() == 2){//should delete a student
            int stuNum = 0;
            System.out.print("Enter the student number");
            stuNum = Scn.nextInt();
            studList.deleteStudent(stuNum);
          }
          if(Scn.nextInt() == 3){//should print a student record
           
          }
          if(Scn.nextInt() == 4){//should search for a student by name or number
           
          }
          if(Scn.nextInt() == 5){//should clear the list
            studList.clearList();
          }
          if(Scn.nextInt() == 6){//should print the list
            studList.printList();
          }
       }
    }
    
}