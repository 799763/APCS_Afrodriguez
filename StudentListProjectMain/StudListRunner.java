import java.util.Scanner;
/**
 * @author (Fernando Rodriguez)
 * @version (25 October 2019)
 */
public class StudListRunner
{
    StudList studList = new StudList();
    public void main(String [] args){
      System.out.println(StudList.getGreeting());
      Scanner Ans = new Scanner (System.in);
      String statement = Ans.nextLine();     
      while (!statement.equals("Quit")){
          System.out.println();
          
      }
      if(statement != "Quit"){
          if(Ans.nextInt() == 1){//should call "addStudent" method?
            
          }
          if(Ans.nextInt() == 2){
           
          }
          if(Ans.nextInt() == 3){
           
          }
          if(Ans.nextInt() == 4){
           
          }
          if(Ans.nextInt() == 5){//should call "clearList" method?
            StudList.clearList();
          }
       }
    }
}