package levels;

import tiles.EmptyTile;
import tiles.Tile;
import tiles.Wall;
import character.Location;
import character.Player;
import chickenlittle.gui.UserInterface;

public class Level {
	private static final int WIDTH = 25;
	private static final int HEIGHT = 25;
	
	private Tile[][] tiles;
	private Player player;
	private UserInterface ui;
//	private GameLogic logic;
	
	public Level() {
		tiles = new Tile[HEIGHT][WIDTH];
		setupEmptyTiles();
		setupWalls();
		setupPlayer();
	}
	
	private void setupEmptyTiles() {
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				tiles[y][x] = new EmptyTile();
			}
		}
	}
	
	private void setupWalls() {
		for (int x = 0; x < WIDTH; x++) {
			tiles[0][x] = new Wall();
			tiles[HEIGHT-1][x] = new Wall();
		}
		
		for (int y = 0; y < HEIGHT; y++) {
			tiles[y][0] = new Wall();
			tiles[y][WIDTH-1] = new Wall();
		}
	}
	
	
	private void setupPlayer() {
		player = new Player(new Location(1, 1));
	}
	
	public void moveLeft() {
		//if (logic.moveLeft())
			ui.redraw(getLevelImg());
	}
	
	public void moveRight() {
		//if (logic.moveRight())
			ui.redraw(getLevelImg());
	}
	
	public void moveUp() {
		//if (logic.moveUp())
			ui.redraw(getLevelImg());
	}
	
	public void moveDown() {
		//if (logic.moveDown())
			ui.redraw(getLevelImg());
	}
	
	
	public char[][] getLevelImg() {
		char[][] array = new char[HEIGHT][WIDTH];
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				array[y][x] = tiles[y][x].toString().charAt(0);
			}
		}
		
		Location l = player.getMyLocation();
		array[l.getY()][l.getX()] = player.toString().charAt(0);
		
		return array;
	}
}
