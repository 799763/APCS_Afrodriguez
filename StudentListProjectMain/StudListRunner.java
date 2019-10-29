import java.util.*;
import java.util.Scanner;
/**
 * Write a description of class StudListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudListRunner
{
    StudList studList = new StudList();
    public static void main(String [] args){
      System.out.println(StudList.getGreeting());
      Scanner in = new Scanner (System.in);
      String statement = in.nextLine();
      
      while (!statement.equals("Bye")){
          System.out.println();
          statement = in.nextLine();
      }
    }
}
