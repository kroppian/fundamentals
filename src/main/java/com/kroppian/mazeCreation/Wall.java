abstract class Wall extends Location {

  protected Wall(Location n, Location e, Location s, Location w){  

    super(n,e,s,w);

  }
  
  abstract public void prettyPrintCurrentLocation();

  abstract public Location newLocation(Location n, Location e, Location s, Location w);

}
