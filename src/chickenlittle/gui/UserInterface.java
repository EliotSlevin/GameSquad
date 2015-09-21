package chickenlittle.gui;

import javax.swing.JFrame;

import levels.Level;

public class UserInterface {
	private Level level;
	private RenderPane render; 
	private JFrame frame;
	
	public UserInterface(Level level) {
		this.level = level;
		frame = new JFrame();
		renderer = new RenderPane();
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
