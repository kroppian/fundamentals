abstract class MazeFactory {

  protected void MazeFactory(){};

  private static boolean instantiated = false;

  abstract Room makeRoom(Location n, Location e, Location s, Location w);
  
  abstract Wall makeWall(Location n, Location e, Location s, Location w);

  public static MazeFactory instantiate(String mazeType){

    MazeFactory instance;  

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
