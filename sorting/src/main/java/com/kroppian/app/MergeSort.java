package com.kroppian.mergesort; 
import java.util.ArrayList;
import com.kroppian.sortingutils.SortingUtils;

class MergeSort {

  public static ArrayList<Integer> mergeSort(ArrayList<Integer> list){

    if (list.size() == 1 || list.size() == 0)
      return list;
    else if(list.size() == 2){
      if(list.get(0) > list.get(1)){
        list.add(0,list.remove(1));
        return list;
      }
    }

    int halfWay = list.size() / 2;

    ArrayList<Integer> left = new ArrayList<Integer>( list.subList(0,halfWay));
    ArrayList<Integer> right = new ArrayList<Integer>( list.subList(halfWay,list.size()));
     
    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left,right);

  }

  public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
  
    boolean found;
    for(int r = 0; r < right.size(); r++){

      for(int l = 0; l < left.size(); l++){
      
        if(right.get(r) <= left.get(l)){
          left.add(l,right.get(r));
          break;
        }else if(l == left.size() - 1){
          left.add(l++,right.get(r));
        }

      }
    
    }
   
    return left;

  }

  public static void main(String argv[]){
 
    ArrayList<Integer> list = new ArrayList<Integer>();

    if((list = SortingUtils.listify(argv)) == null){
      System.err.println("Unable to parse array. Exiting."); 
      System.exit(1);
    }
    
    System.out.println("Before:"); 

    System.out.println(list.toString()); 
    System.out.println("---"); 

    list = mergeSort(list);

    System.out.println(""); 
    System.out.println("---"); 
    System.out.println("After:"); 
    System.out.println(list.toString()); 


  }

}
