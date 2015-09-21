package chickenlittle.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextPane;

public class BoardCanvas extends JPanel {
	private JTextPane text = new JTextPane();
	
	public BoardCanvas() {
		super();
		setBackground(Color.black);
		text.setText("Test");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	private static final long serialVersionUID = 1L;

}
