import java.util.Scanner;
/**
 * Write a description of class PersonClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonClass
{
    String fName = "";
    String mName = "";
    String lName = "";
    String fullName = "";
     
    public static void test(){
        
    }
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
        }
        int Si = fName.indexOf(",");
        
        
        
          
    }
}