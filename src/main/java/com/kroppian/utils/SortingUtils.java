package com.kroppian.utils;

import java.util.ArrayList;

public class SortingUtils {

  public static int[] listify(String[] source){
 
    int[] destination = new int[source.length];

    for(int i = 0; i < source.length; i++){
      try {
        destination[i] = Integer.parseInt(source[i]); 
      }catch(NumberFormatException e){
        System.err.println("Item number " + (i + 1) + 
            " is not a valid integer: \"" + source[i] + "\""); 
        return null; 
      }
    }

    return destination;

  }

}
