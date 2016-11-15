package com.kroppian.sorting; 
import java.util.Arrays;
import com.kroppian.utils.SortingUtils;

class MergeSort {

  public static void mergeSort(int[] list, int begindex, int endex){

    int listLength = endex - begindex;

    if(listLength == 0) return;

    mergeSort(list, begindex, begindex + (listLength / 2));
    mergeSort(list, begindex + (listLength / 2) + 1, endex );

    merge(list, begindex, begindex + (listLength / 2) + 1, endex);

    return;

  }

  private static void merge(int[] arr, int begindex, int mindex, int endex){
  
    //System.out.println("Going in: " + Arrays.toString(arr)); 
    //System.out.println("begindex: " + begindex); 
    //System.out.println("Mindex: " + mindex); 
    //System.out.println("endex: " + endex); 

    int[] origArr = new int[arr.length];

    System.arraycopy(arr, 0, origArr,0 ,arr.length);

    int leftPos = begindex;
    int rightPos = mindex;

    // Assuming both the left and the right side are sorted themselves...
    for(int i = begindex; i < (endex + 1); i++){
  
      //System.out.println(origArr[leftPos] + " vs. " + origArr[rightPos]);

      if(leftPos >= mindex){
        //System.out.println("0");
        arr[i] = origArr[rightPos];
        rightPos++;
      }else if(rightPos > endex){
        //System.out.println("1");
        arr[i] = origArr[leftPos];
        leftPos++;
      }else if(origArr[leftPos] <= origArr[rightPos]){
        //System.out.println("2");
        arr[i] = origArr[leftPos]; 
        leftPos++;
      }else{
        //System.out.println("3");
        arr[i] = origArr[rightPos];
        rightPos++;
      }
    
    }

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

    mergeSort(list, 0, (list.length - 1) );

    System.out.println(""); 
    System.out.println("---"); 
    System.out.println("After:"); 
    System.out.println(Arrays.toString(list)); 

  }

}
