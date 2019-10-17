import java.util.Scanner;
/**
 * Write a description of class RunnerClass here.
 *
 * @author (Fernando Rodriguez)
 * @version (926)
 */
public class PersonRunner{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            Person p1 = new Person(inputStr);
         
        }
    }
}
