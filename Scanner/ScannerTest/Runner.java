import java.util.Scanner;
/**
 * Write a description of class RunnerClass here.
 *
 * @author (Fernando Rodriguez)
 * @version (829)
 */
public class Runner
{
    String fullName = "";
    public static void main(){
      
      Scanner kb = new Scanner(System.in);
      String fullName = "";
      //  if(str1 == str2)
      while(!fullName.equals("quit")){
          System.out.println("Enter a name or type \"quit\" to quit");
          fullName = kb.nextLine();
          System.out.println(fullName);
        }
        
        
      //Runner so = new Runner();
      //Runner po = new Runner();
      
    }
}
//public String fullName (String[] args){