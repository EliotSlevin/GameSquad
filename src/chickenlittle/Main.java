package chickenlittle;

import javax.swing.JFrame;

import renderer.Render;
import renderer.RenderPane;

/**
 * This method will make a new frame and display a 2d array of chars
 * @author Eliot
 *
 */


public class Main {
	public static void main(String[] args) {
		Render UI = new Render();
		

        
	       
        char[][] level =    {{'w','w','e','e'},
                            {'w','e','p','e'},
                            {'e','e','e','e'},
                            {'e','e','e','e'}};
		UI.redraw(level);
	}
}

