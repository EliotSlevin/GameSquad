package chickenlittle.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener {

	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W){
			//moveUp()
		} else if (e.getKeyCode() == KeyEvent.VK_S){
			//moveDown()
		} else if (e.getKeyCode() == KeyEvent.VK_A){
			//moveLeft()
		} else if (e.getKeyCode() == KeyEvent.VK_D){
			//moveRight()
		} else {
			System.out.println("You fucked up");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}
}
