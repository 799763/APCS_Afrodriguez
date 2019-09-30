import java.util.Scanner;
/**
 * Write a description of class RunnerClass here.
 *
 * @author (Fernando Rodriguez)
 * @version (829)
 */
public class Runner
{
    
    public String fullName(){
      Scanner kb = new Scanner(System.in);
      String fullName = "";
      //  if(str1 == str2)
      while(!fullName.equals("quit")){
          System.out.println("Enter a name or type \"quit\" to quit");
          fullName = kb.nextLine();
          System.out.println(fullName);
        }
      return fullName;
    }
}
//public String fullName (String[] args)