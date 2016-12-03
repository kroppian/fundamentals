abstract class AbstractMazeFactory {

  protected void AbstractMazeFactory(){};

  private static boolean instantiated = false;

  abstract Room makeRoom(Location n, Location e, Location s, Location w);
  
  abstract Wall makeWall(Location n, Location e, Location s, Location w);

  abstract void prettyPrint();

  public static AbstractMazeFactory instantiate(String mazeType){

    AbstractMazeFactory instance;  

    if (instantiated){
      instance = null;
    } else if(mazeType == "boring"){
      instance = new BoringMazeFactory();
      instantiated = true;
    }else {
      instance = null; 
    }

    return instance;
  
  };

}
