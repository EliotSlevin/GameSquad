package character;

public class Location {
	private int x;
	private int y;

	/**
	 * @param y
	 * @param x
	 */
	public Location(int y, int x) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return x value
	 */
	public int getX(){
		return x;
	}

	/**
	 * @return y value
	 */
	public int getY(){
		return y;
	}
}
