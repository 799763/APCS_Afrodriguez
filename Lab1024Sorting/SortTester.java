import java.util.*;
/**
 * Write a description of class SortTester here.
 *
 * @author (Fernando Rodriguez)
 * @version (22 October 2019)
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
    public void insertSort(){
<<<<<<< HEAD
      /*for(int i = numList.size() - 1; i > 0; i--){
        for(int j = 1; j<i; j--){
          comp++;  
          if (numList.get(j)>numList.get(j+1)){
            numList.set(j, j+1);
            swap++;
          }
        }
      }
      */
      
    }
    public void insertsort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    
    //////////////////////////////////////////////////////////////////////////
=======2
      for(int i = 1; i > 0; i++){
        for(int j = 1; j > 0; j--){
          comp++;
          if (numList.get(j)>numList.get(j-1)){
            Integer temp = numList.get(j);
            numList.set(j-1, j);
            numList.set(j, temp);
          }
        }
      }
      System.out.println(numList);
      System.out.println("Number of swaps: " + swap);
      System.out.println("Number of compares: " + comp);
    }
>>>>>>> f3eaa04c1c78148de9801451d5395eb7e88d6023
    public void selectSort(){
       int temp;
       for(int i = 0; i <numList.size(); i++){
         int index = i;
         for(int j = i; j > numList.size(); j++ ){
            index = j;
         }
         int smaller = numList.size();
       }  
    }
    
    public void printList(){
       System.out.println(numList);
      System.out.println("Number of swaps: " + swap);
      System.out.println("Number of compares: " + comp);
      
        
    }
    
}
