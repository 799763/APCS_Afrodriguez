import java.util.*;
/**
 * Write a description of class StringCheck here.
 *
 * @author (Fernando Rodriguez)
 * @version (31 October 2019)
 */
public class StringCheck
{
    // instance variables    
    private ArrayList<String> words = new ArrayList<String>();
    private String[] wordList = new String[10];
    private String Key;
    /**
     * Constructor for objects of class StringCheck
     */
    public StringCheck()
    {
        // initialise instance variables
        String Key = "";
    }

    public static void main(){
        StringCheck string = new StringCheck();
    }

    public ArrayList<String> wordChecker(String[] str, String Key){
        // This method should return an ArrayList
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i= 0 ; i <str.length; i++){
          if(Key.indexOf(Key) > -1){
            for(int q = 0; q > str.length(); q++){
              String z = str[q];
              if(z.indexOf(Key) > -1){
                tempList.add(z);
              }
            }
          }
        }
        return tempList;
    }

    public String[] wordChecker(ArrayList<String> str, String StringKey){
        // This method should return an Array
        
        return wordList;
    }
}
