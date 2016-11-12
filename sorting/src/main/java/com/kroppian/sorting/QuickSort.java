package com.kroppian.quicksort;

import java.util.ArrayList;
import com.kroppian.utils.SortingUtils;

class QuickSort {


  public static ArrayList<Integer> quickSort(ArrayList<Integer> list){
    
    if(list.size() == 0)
      return list;

    ArrayList<Integer> lessThanEqualTo = new ArrayList<Integer>(0);
    ArrayList<Integer> greaterThan = new ArrayList<Integer>(0);

    int pivot = list.remove(0);
    int originalListSize = list.size();

    for(int i = 0; i < originalListSize; i++){
   
      if(list.get(0) > pivot){
        greaterThan.add(list.remove(0));
      } else {
        lessThanEqualTo.add(list.remove(0));
      }

    }

    lessThanEqualTo = quickSort(lessThanEqualTo);
    greaterThan = quickSort(greaterThan);

    lessThanEqualTo.add(pivot);
    lessThanEqualTo.addAll(greaterThan);
    return lessThanEqualTo;

  }

  public static void main(String[] argv){

    ArrayList<Integer> list = new ArrayList<Integer>();

    if((list = SortingUtils.listify(argv)) == null){
      System.err.println("Unable to parse array. Exiting."); 
      System.exit(1);
    }

    System.out.println("Before:"); 

    System.out.println(list.toString()); 
    System.out.println("---"); 

    list = quickSort(list);

    System.out.println(""); 
    System.out.println("---"); 
    System.out.println("After:"); 
    System.out.println(list.toString()); 


  }

}
