import java.util.*;
/**
 * @author (Fernando Rodriguez)
 * @version (31 October 2019)
 */
public class StringCheck
{
    // instance variables    
    private ArrayList<String> wordList = new ArrayList<String>();
    private String[] wordArray = {"Cat", "Catcher", "Catchup", "CatDog", "Dog", "Doggy", "DogCat"};
    /**
     * Constructor for objects of class StringCheck
     */
    public StringCheck()
    {
        // initialise instance variables
        String Key = "Cat";
        loadList();       
        ArrayList<String> keyList = wordChecker1(wordArray, Key); 
        printList(keyList);
    }
    public static void main(){
        StringCheck string = new StringCheck();
    }
    public void loadList(){
      wordList.add("Cat");
      wordList.add("Cather");
      wordList.add("Cathup");
      wordList.add("CatDog");
      wordList.add("Dog");
      wordList.add("Doggy");
      wordList.add("DogCat");      
    }
    public void printList(ArrayList<String> list){
      for(int i = 0; i < wordList.size(); i++){  
        System.out.println(wordList.get(i));
      }
    }
    /*
     * This method should take in an Array and return an ArrayList
     */
    public ArrayList<String> wordChecker1(String[] str, String k){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i = 0 ; i < str.length; i++){
          if(str[i].indexOf(k) > -1){
             tempList.add(str[i]);
          }
        }
        return tempList;
    }
     // /*
      // * This method should take in an ArrayList and return an Array
      // */
     // public String[] wordChecker2(ArrayList<String> str, String StringKey){
         // ArrayList<String> tempList = new ArrayList<String>();
         // for(int i = 0 ; i < str.size(); i++){
           // if(Key.indexOf(Key) > -1){          
               // if(str.get(1).indexOf(Key) > -1){
                 // tempList.add(i);
               // }
           // }
         // }
         // return wordList;
     // }
}