package com.kroppian.sorting; 
import java.util.Arrays;
import com.kroppian.utils.SortingUtils;

class HeapSort {


  private static void swap(int arr[], int val1dex, int val2dex){

    int value1 = arr[val1dex];
    arr[val1dex] = arr[val2dex];
    arr[val2dex] = value1;

    return;

  }

  public static void main(String argv[]){
 
    int[] list;

    if((list = SortingUtils.listify(argv)) == null){
      System.err.println("Unable to parse array. Exiting."); 
      System.exit(1);
    }
    
    System.out.println("Before:"); 

    System.out.println(Arrays.toString(list)); 
    System.out.println("---"); 

    swap(list, 1, (list.length - 1));

    System.out.println(""); 
    System.out.println("---"); 
    System.out.println("After:"); 
    System.out.println(Arrays.toString(list)); 

  }

  

}

