abstract class Location {

  Location north;
  Location east;
  Location south;
  Location west;

  public void Location(Location n, Location e, Location s, Location w){
 
    this.north = n;
    this.south = s;
    this.east = e;
    this.west = w;

  }

}
