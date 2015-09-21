package renderer;

import javax.swing.JFrame;

public class Render {
	private RenderPane gameCanvas;
	
	public Render(){
		JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gameCanvas = new RenderPane();
        
        
       
//        char[][] level =    {{'w','w','e','e'},
//                            {'w','e','p','e'},
//                            {'e','e','e','e'},
//                            {'e','e','e','e'}};


        f.add(gameCanvas);
        f.pack();
        f.setVisible(true);
	}
	
	public void redraw(char[][] level){
		this.gameCanvas.setLevel(level);
		this.gameCanvas.repaint();
	}
}
