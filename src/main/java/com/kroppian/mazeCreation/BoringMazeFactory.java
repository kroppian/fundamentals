class BoringMazeFactory extends AbstractMazeFactory {

  EmptyRoom makeRoom(){
 
    return new EmptyRoom();

  }  

  StoneWall makeWall(){
 
    return new StoneWall(); 
  
  }


}
