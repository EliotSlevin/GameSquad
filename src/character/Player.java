package character;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private Point myLocation;
	private List<String> inventory = new ArrayList<String>();
	
	public Player(Point loc){
		this.myLocation = loc;
	}

	public Point getMyLocation() {
		return this.myLocation;
	}
	
	public void setMyLocation(Point myLocation) {
		this.myLocation = myLocation;
	}
	
	public List<String> getInven(){
		return inventory;
	}
	
	public void addToInven(String item){
		inventory.add(item);
	}
	
	public void testInven(){
		for (String s : inventory){
			System.out.println(s);
		}
	}
	
	@Override
	public String toString() {
		return "p";
	}
}