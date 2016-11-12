package com.kroppian.utils;

import java.util.ArrayList;

public class SortingUtils {

  public static ArrayList<Integer> listify(String[] source){
 
    ArrayList<Integer> destination = new ArrayList<Integer>();

    for(int i = 0; i < source.length; i++){
      try {
        destination.add(Integer.parseInt(source[i])); 
      }catch(NumberFormatException e){
        System.err.println("Item number " + (i + 1) + 
            " is not a valid integer: \"" + source[i] + "\""); 
        return null; 
      }
    }

    return destination;

  }

}
