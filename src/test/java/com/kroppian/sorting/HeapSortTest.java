package com.kroppian.sorting;

import static org.junit.Assert.*;
import com.kroppian.sorting.HeapSort;
import org.junit.Test;
import java.util.Arrays;


public class HeapSortTest {


  @Test
  public void testSingleNumberHeapify(){
 
    int testArr[] = {1};
    int goalArr[] = {1};

    HeapSort.heapify(testArr,0,(testArr.length-1)); 

    assertArrayEquals("One item in, same item out",testArr,goalArr); 

  }

  @Test
  public void testAlreadyHeapify(){
 
    int testArr[] = {9, 1};
    int goalArr[] = {9, 1};

    HeapSort.heapify(testArr,0,(testArr.length-1)); 

    assertArrayEquals("Already heapified. No action requ.",goalArr,testArr); 

  }

  @Test
  public void testParentLTChildLeft(){
 
    int testArr[] = {1, 9};
    int goalArr[] = {9, 1};

    HeapSort.heapify(testArr,0,(testArr.length-1)); 

    assertArrayEquals("Switch left child with larger parent.",goalArr,testArr); 

  }

  @Test
  public void testParentEqualToChildOne(){
 
    int testArr[] = {9, 9};
    int goalArr[] = {9, 9};

    HeapSort.heapify(testArr,0,(testArr.length-1)); 

    assertArrayEquals("Switch left child with larger parent.",goalArr,testArr); 

  }

  @Test
  public void testParentEqualToChildTwo(){
 
    int testArr[] = {9, 9, 9};
    int goalArr[] = {9, 9, 9};

    HeapSort.heapify(testArr,0,(testArr.length-1)); 

    assertArrayEquals("Switch left child with larger parent.",goalArr,testArr); 

  }



  @Test
  public void testParentLTChildRight(){
 
    int testArr[] = {1, 0, 9};
    int goalArr[] = {9, 0, 1};

    HeapSort.heapify(testArr,0,(testArr.length-1)); 

    assertArrayEquals("Switch right child with larger parent.",goalArr,testArr); 

  }



}
