import java.util.ArrayList;

class QuickSort {


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

  public static void main(String[] argv){

    ArrayList<Integer> list = new ArrayList<Integer>();

    if((list = listify(argv)) == null){
      System.err.println("Unable to parse array. Exiting."); 
      System.exit(1);
    }

  }

}
