abstract public class Room extends Location {

  protected Room(Location n, Location e, Location s, Location w){
  
    super(n,e,s,w);
  
  }

  abstract public void prettyPrintCurrentLocation();

  abstract public Location newLocation(Location n, Location e, Location s, Location w);

}
