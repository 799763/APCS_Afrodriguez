import java.util.Scanner;
/**
 * Scanner tester
 *
 * @author (Fernando Rodriguez)
 * @version (924)
 */


public class Runner{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        while(!inputStr.equals("quit")){
            Person p = new Person();
            System.out.println(inputStr);
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
        }
    }
}
