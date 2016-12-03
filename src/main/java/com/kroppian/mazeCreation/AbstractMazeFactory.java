abstract class AbstractMazeFactory {

  protected void AbstractMazeFactory(){};

  abstract Room makeRoom(Location n, Location e, Location s, Location w);
  
  abstract Wall makeWall(Location n, Location e, Location s, Location w);

}
