package chickenlittle.gui;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import character.Location;
import character.Player;
import levels.Level;

public class TextUI {
	private char[][] array;
	private char[][] origArray;
	
	public TextUI(){
		Level lev = new Level();
		array = lev.getLevel();
		origArray = array.clone();
	}
	
	public void setArray(char[][] array){
		this.array = array;
	}
	
	public void repaint(Location previous, Player p){
		Location local = p.getMyLocation();
		int oldX = previous.getX();
		int oldY = previous.getY();
		int newX = local.getX();
		int newY = local.getY();
		System.out.println("\n\n\n\n\n\n\n");		// Push back old data
		for (int y=0; y<array[0].length; y++){
			System.out.print("\n|");
			for (int x=0; x<array.length; x++){
				System.out.print(array[x][y]);
				System.out.print("|");
			}
		}
		array[oldX][oldY] = origArray[oldX][oldY];
		array[newX][newY] = 'C';
	}

}
