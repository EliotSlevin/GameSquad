package tiles;

public class Chest implements Tile {
	private boolean state = true;
	
	public String toString() {
		return "c";
	}
	public boolean getState(){
		return state;
	}
	public void emptyChest(){
		this.state = false;
	}
}
