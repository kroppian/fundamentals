class BoringMazeFactory extends MazeFactory {

  EmptyRoom makeRoom(Location n, Location e, Location s, Location w){
 
    return new EmptyRoom(n,e,s,w);

  }  

  StoneWall makeWall(Location n, Location e, Location s, Location w){
 
    return new StoneWall(n,e,s,w); 
  
  }


}
