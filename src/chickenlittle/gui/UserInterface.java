package chickenlittle.gui;

import levels.Level;

public class UserInterface {
	private Level level;
	
	public UserInterface(Level level) {
		this.level = level;
	}
	
	public void redraw(char[][] levelImg) {
	}
	
	public void moveLeft() {
		level.moveLeft();
	}
	
	public void moveRight() {
		level.moveRight();
	}
	
	public void moveUp() {
		level.moveUp();
	}
	
	public void moveDown() {
		level.moveDown();
	}
}
