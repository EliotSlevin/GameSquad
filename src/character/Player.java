package character;

import item.Item;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private Point myLocation;
	private List<Item> inventory = new ArrayList<Item>();
	
	public Player(Point loc){
		this.myLocation = loc;
	}

	public Point getMyLocation() {
		return this.myLocation;
	}
	
	public void setMyLocation(Point myLocation) {
		this.myLocation = myLocation;
	}
	
	public List<Item> getInven(){
		return inventory;
	}
	
	public void addToInven(Item item){
		inventory.add(item);
	}
	
	public void testInven(){
		for (Item s : inventory){
			System.out.println(s.toString());
		}
	}
	
	@Override
	public String toString() {
		return "p";
	}
}