package chickenlittle;

import javax.swing.JFrame;
import renderer.RenderPane;

/**
 * This method will make a new frame and display a 2d array of chars
 * @author Eliot
 *
 */



public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RenderPane gameCanvas = new RenderPane();
        
        
       
        char[][] level =    {{'w','w','e','e'},
                            {'w','e','p','e'},
                            {'e','e','e','e'},
                            {'e','e','e','e'}};


        gameCanvas.setLevel(level);


        f.add(gameCanvas);
        f.pack();
        f.setVisible(true);
	}
}
