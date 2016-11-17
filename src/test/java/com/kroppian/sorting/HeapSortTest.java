package com.kroppian.sorting;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import com.kroppian.sorting.HeapSort;


public class HeapSortTest {


  @Test
  public void testHelloWorld(){
 
    int origArr[] = {1,2,3,4,5};
    int testArr[] = {1,2,3,4,5};

    HeapSort.heapify(testArr); 

    assertArrayEquals("Test test test",origArr,testArr); 

  }

}
