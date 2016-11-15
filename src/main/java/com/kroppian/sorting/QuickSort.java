package com.kroppian.sorting;

import java.util.Arrays;
import com.kroppian.utils.SortingUtils;

class QuickSort {

  public static void quickSort(int[] list, int begindex, int endex){

    System.out.println("in: [" + begindex + " " + endex + "]" );


    if((endex - begindex) <= 0) return;

    int pivot = list[begindex];
    int[] origList = new int[list.length];
   
    // Copy the list into a new array to serve as a reference
    for(int i = 0; i < list.length; i++) 
      origList[i] = list[i];

    // The next spot a greater than or equal to item will go
    int nextGTESpot = endex;

    // The next spot a less than item will go
    int nextLTSpot = begindex;
    //System.out.println("" nextLTSpot);

    for(int i = begindex + 1; i < (endex - begindex + 1); i++) {
      
      if (origList[i] < pivot){
        list[nextLTSpot] = origList[i];
        nextLTSpot++;
      } else {
        list[nextGTESpot] = origList[i] ;
        nextGTESpot--;
      }
    }

    list[nextLTSpot] = pivot;

    // Quick sort the two seconds of array to the 
    // left and to the right of the pivot
    System.out.println("out0: [" + begindex + " " + (nextLTSpot - 1) + "]" );
    System.out.println("out1: [" + (nextLTSpot + 1) + " " + endex + "]" );
    if((nextLTSpot - 1) >= 0)
      quickSort(list, begindex, (nextLTSpot - 1)); 
    
    if((nextLTSpot + 1) <= endex)
      quickSort(list, (nextLTSpot + 1), endex); 

  }

  public static void main(String[] argv){
    
    int[] list;

    if((list = SortingUtils.listify(argv)) == null){
      System.err.println("Unable to parse array. Exiting."); 
      System.exit(1);
    }

    System.out.println("Before:"); 

    System.out.println(Arrays.toString(list)); 
    System.out.println("---"); 

    quickSort(list, 0, list.length - 1);

    System.out.println(""); 
    System.out.println("---"); 
    System.out.println("After:"); 
    System.out.println(Arrays.toString(list)); 


  }

}
