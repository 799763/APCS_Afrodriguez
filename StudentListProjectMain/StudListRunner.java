import java.util.Scanner;
/**
 * @author (Fernando Rodriguez)
 * @version (25 October 2019)
 */
public class StudListRunner
{
    StudList studList = new StudList();
    public static void main(String [] args){
      System.out.println(StudList.getGreeting());
      Scanner Ans = new Scanner (System.in);
      String statement = Ans.nextLine();     
      while (!statement.equals("Quit")){
          System.out.println();
          statement = Ans.nextLine();
      }
      while(statement.equals("1")){
          if(Ans.nextInt() == 1){
            
          }
          if(Ans.nextInt() == 2){
           
          }
          if(Ans.nextInt() == 3){
           
          }
          if(Ans.nextInt() == 4){
           
          }
          if(Ans.nextInt() == 5){
           
          }
       }
    }
}