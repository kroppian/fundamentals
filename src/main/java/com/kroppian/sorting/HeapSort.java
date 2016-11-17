package com.kroppian.sorting; 
import java.util.Arrays;
import com.kroppian.utils.SortingUtils;

class HeapSort {

  public static void sort(int arr[])
  {

    // Heapify from the bottom up
    // for 
      heapify(arr);

    // for each item (i) in arr
    for(int i = 0; i < arr.length; i++)
    {

    
    }  

  }

  /*
   * Assumes that all child nodes are already heapified
   */
  private static void heapify(int arr[])
  {

    // if the child is larger than the parent
    
      // Swap  child and parent

      // Call heapify on child


  }

  private static int getParent(int index){
  
    if(index % 2 == 0)
      parent = (index - 2) / 2;
    else 
      parent = (index - 1) / 2;

    return parent; 

  }

  public static void siftDown(int arr[])
  {
   
    

  }

  private static void swap(int arr[], int val1dex, int val2dex)
  {

    int value1 = arr[val1dex];
    arr[val1dex] = arr[val2dex];
    arr[val2dex] = value1;

    return;

  }

  public static void main(String argv[])
  {
 
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

