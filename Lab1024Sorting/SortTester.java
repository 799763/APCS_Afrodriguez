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

      for(int i = numList.size() - 1; i > 0; i--){
        for(int j = 1; j<i; j--){
          comp++;  
          if (numList.get(j)>numList.get(j+1)){
            numList.set(j, j+1);
            swap++;
          }
        }
      }
    }

   public void selectSort(){
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
    }
   
   public static void mergeSort(int[] a, int n){
       if(n<2){ 
           return;
        }
       int mid = n/2;
       int[]l = new int[mid];
       int[]r = new int[n - mid];
       for(int i = 0; i < mid; i++){
           l[i] = a[i];
       }
       for(int i = 0; i < n; i++){
           r[i-mid] = a[i];
       }
       mergeSort(l, mid);
       mergeSort(r, n-mid);
       merge(a, l, r, mid, n-mid);
   }
   public static void merge(int[] a, int[] l, int[] r, int left, int right){
       int i = 0, j = 0, k = 0;
       while(i < left && j < right){
           if(l[i] <= r[j]){
               a[k++] = l[i++];
           }else{
               a[k++] = r[j++];
           }
           while( i < left){ a[k++] = l[i++];}
           while( i < right){ a[k++] = l[i++];}
       }
   }
    }

    
         
    

