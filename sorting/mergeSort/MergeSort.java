import java.util.ArrayList;

class MergeSort {

  public static void main(String argv[]){
 
    ArrayList<Integer> list = new ArrayList<Integer>();

    if((list = SortingUtils.listify(argv)) == null){
      System.err.println("Unable to parse array. Exiting."); 
      System.exit(1);
    }
    
    System.out.println("Before:"); 

    System.out.println(list.toString()); 
    System.out.println("---"); 

    //list = quickSort(list);

    System.out.println(""); 
    System.out.println("---"); 
    System.out.println("After:"); 
    System.out.println(list.toString()); 


  }

}
