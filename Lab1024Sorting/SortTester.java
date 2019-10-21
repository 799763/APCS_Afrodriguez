import java.util.*;
/**
 * Write a description of class SortTester here.
 *
 * @author (Fernando Rodriguez)
 * @version (10/24)
 */
public class SortTester
{
    // instance variables - replace the example below with your own
    ArrayList<Integer> numList = new ArrayList<Integer>();
    int swap = 0;
    int comp = 0;
    /**
     * Constructor for objects of class SortTester
     */
    public SortTester()
    {
        // initialise instance variables
        loadNumbers(10);
        bubbleSort();
        insertSort();
    }
    public void loadNumbers(int num){
        for(int i = 0; i < 10; i++){ 
            int n = (int)(Math.random()*10)+1;
            numList.add(n);
        }
    }
    public void bubbleSort(){
      for(int i = numList.size() - 1; i > 0; i--){
        for(int j = 0; j<i; j++){
          comp++;  
          if (numList.get(j)>numList.get(j+1)){
            numList.set(j, j+1);
            swap++;
          }
        }
      }
      System.out.println(numList);
      System.out.println("Number of swaps: " + swap);
      System.out.println("Number of compares: " + comp);
    }
    
    ////////COMPLETE INSERT SORT FOR HOMEWORK/////////////////////////////////
    // ( OPEN THE SLIDES)//
    public void insertSort(){
      for(int i = numList.size() - 1; i > 0; i--){
        for(int j = 1; j<i; j--){
          comp++;  
          if (numList.get(j)>numList.get(j+1)){
            numList.set(j, j+1);
            swap++;
          }
        }
      }
      System.out.println(numList);
      System.out.println("Number of swaps: " + swap);
      System.out.println("Number of compares: " + comp);
      
    }
    
    //////////////////////////////////////////////////////////////////////////
    public void selectSort(){
    
    }
}
