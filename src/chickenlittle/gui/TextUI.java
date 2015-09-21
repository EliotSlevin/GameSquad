package chickenlittle.gui;

import character.Location;
import character.Player;
import levels.Level;

public class TextUI {
	private char[][] array;
	private char[][] origArray = new char[25][25];
	
	public TextUI(){
		Level lev = new Level();
		array = lev.getLevel();
		for (int y=0; y<array[0].length; y++){
			for (int x=0; x<array.length; x++){
				origArray[y][x] = array[y][x];
			}
		}
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
		array[oldX][oldY] = origArray[oldX][oldY];
		array[newX][newY] = 'C';
		System.out.println("\n\n\n\n\n\n\n");		// Push back old data
		for (int y=0; y<array[0].length; y++){
			System.out.print("\n|");
			for (int x=0; x<array.length; x++){
				System.out.print(array[x][y]);
				System.out.print("|");
			}
		}
	}

}
