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
      
      while (!statement.equals("Bye")){
          System.out.println();
          statement = Ans.nextLine();
      }
    }
}