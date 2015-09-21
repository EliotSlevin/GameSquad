package chickenlittle.gui;

import levels.Level;

public class TextUI {
	private char[][] array;
	
	public TextUI(){
		Level lev = new Level();
		array = lev.getLevel();
	}
	
	public void setArray(char[][] array){
		this.array = array;
	}
	
	public void repaint(){
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
