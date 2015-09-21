package character;

public class Player {
	private Location myLocation;
	
	public Player(Location loc){
		this.myLocation = loc;
	}

	public Location getMyLocation() {
		return this.myLocation;
	}
	
	public void setMyLocation(Location myLocation) {
		this.myLocation = myLocation;
	}
}