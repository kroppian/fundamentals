class EmptyRoom extends Room {

  protected EmptyRoom(Location n, Location e, Location s, Location w){
  
    super(n,e,s,w);
 
  } 

  public void prettyPrintCurrentLocation(){
  
    System.out.print(" "); 

  }

  public Location newLocation(Location n, Location e, Location s, Location w){
  
    return new EmptyRoom(n, e, s, w); 

  }

}
