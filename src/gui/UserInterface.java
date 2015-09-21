package gui;

import java.awt.event.KeyEvent;

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
	
//	NORTH (KeyEvent.VK_W),
//	EAST (KeyEvent.VK_D),
//	SOUTH (KeyEvent.VK_S),
//	WEST (KeyEvent.VK_A);
	
//	@Override
//	public void keyReleased(KeyEvent e) {}
//	
//	@Override
//	public void keyPressed(KeyEvent e) {
//		if (e.getKeyCode() == KeyEvent.VK_W){
//			//moveUp()
//		} else if (e.getKeyCode() == KeyEvent.VK_S){
//			//moveDown()
//		} else if (e.getKeyCode() == KeyEvent.VK_A){
//			//moveLeft()
//		} else if (e.getKeyCode() == KeyEvent.VK_D){
//			//moveRight()
//		} else {
//			System.out.println("You fucked up");
//		}
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {}
}
