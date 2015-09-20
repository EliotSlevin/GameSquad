package chickenlittle.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Receives game state info through DataInputStream and updates interface
 * Notifies master connection of player input through DataOutputStream
 * @author Thorbukirs
 */
public class Listener implements KeyListener, MouseListener, ActionListener {
	private final Socket socket;
	private DataOutputStream output;
	private DataInputStream input;
	// TODO game data
	
	public Listener(Socket socket) {				
		this.socket = socket;
	}
	
	/**
	 * Run the game while the connection remains established.
	 * Updates the local board from the input stream and displays it.
	 */
	public void run(){
		try {
			output = new DataOutputStream(socket.getOutputStream());
			input = new DataInputStream(socket.getInputStream());
			
			// TODO read setup input
			
			// create new BoardFrame for this client
			
			boolean exit = false;
			while (!exit){												/*Game Loop*/
				// TODO read input data, update game, repaint BoardFrame
			}
			
			socket.close();
		} catch(IOException e) {
			System.err.println("I/O Error: " + e.getMessage());
			e.printStackTrace(System.err);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO output sent from here
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO output sent from here
	}
	
	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
}
