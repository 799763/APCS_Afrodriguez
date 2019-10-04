
/**
 * Scanner tester
 *
 * @author (Fernando Rodriguez)
 * @version (924)
 */

import java.util.Scanner;
public class Runner{
    
    
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        System.out.println("Enter a name or type \"quit\" to quit");
        inputStr = kb.nextLine();
        System.out.println(inputStr);
        while(!inputStr.equals("quit")){
            Person p = new Person();
        }
        
        
    }
}
