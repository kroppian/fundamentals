class MazeAdventure {

  public static void main(String[] args){
    System.out.println("Hello world!");  

    AbstractMazeFactory bob = AbstractMazeFactory.instantiate("boring");

    if(bob != null){
      System.out.println("All is good"); 
    } else {
      System.out.println("Not where we want to be"); 
    } 

  }

}
