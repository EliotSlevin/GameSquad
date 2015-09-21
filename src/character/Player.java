package character;

public class Player implements Character, Moveable {
	private Location myLocation;

	public Location getMyLocation() {
		return myLocation;
	}

	public void setMyLocation(Location myLocation) {
		this.myLocation = myLocation;
	}

	public Player(Location loc){
		this.myLocation = loc;
	}
	
	@Override
	public boolean moveUp() {
		int newY = getMyLocation().getY() + 1;
		setMyLocation(new Location(newY, getMyLocation().getX()));
		return true;
	}

	@Override
	public boolean moveDown() {
		int newY = getMyLocation().getY() - 1;
		setMyLocation(new Location(newY, getMyLocation().getX()));
		return true;
	}

	@Override
	public boolean moveLeft() {
		int newX = getMyLocation().getX() - 1;
		setMyLocation(new Location(getMyLocation().getY(), newX));
		return true;
	}

	@Override
	public boolean moveRight() {
		int newX = getMyLocation().getX() + 1;
		setMyLocation(new Location(getMyLocation().getY(), newX));
		return true;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}

}
