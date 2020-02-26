import java.util.*;
import java.util.List;
/**
 * Write a description of class HW_108 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW_108
{    
    //ArrayList<String> arlist = new ArrayList<String>();
    //String[] list = new String[]{};
    /**
     * Constructor for objects of class HW_108
     */
    public HW_108()
    {
        
    } 

    public ArrayList<String> reverseList(ArrayList<String>  list){
       ArrayList<String> Result = new ArrayList<String>();
       for(int i = 0; i < list.size(); i++){
         Result.add(list.get(i));
       }
       return (Result);
    } 
    
    public String[] reverseArr(String[] list){
       String[] Result = new String[]{};
       for(int i = 0; i < list.length; i++){
          
       }
       return (Result);
    }        
}
