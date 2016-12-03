abstract class Location {

  //private static locations 

  Location north;
  Location east;
  Location south;
  Location west;

  protected Location(Location n, Location e, Location s, Location w){
 
    this.north = n;
    this.south = s;
    this.east = e;
    this.west = w;

  }

  public void prettyPrint(int radius){
  
    for(int i = 0; i < (radius * 2 + 1); i++){
   
      for(int j = 0; j < (radius * 2 + 1); j++){
        if(i == radius + 1 && j == radius + 1)
          this.prettyPrintCurrentLocation();
        else   
          System.out.print("~");
      }
    
    } 
  
  }

  abstract public void prettyPrintCurrentLocation();

  abstract public Location newLocation(Location n, Location e, Location s, Location w);
  
}
