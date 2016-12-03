class StoneWall extends Wall {

  protected StoneWall(Location n, Location e, Location s, Location w){  

    super(n,e,s,w);

  }

  public void prettyPrintCurrentLocation(){
  
    System.out.print("#"); 
  }

  public Location newLocation(Location n, Location e, Location s, Location w){
  
    return new StoneWall(n, e, s, w); 
  }

}
