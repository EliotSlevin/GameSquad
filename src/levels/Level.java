package levels;

import tiles.EmptyTile;
import character.Character;
import character.Moveable;
import character.Location;
import character.Player;
import tiles.Tile;
import tiles.Wall;

public class Level {
	private static final int WIDTH = 25;
	private static final int HEIGHT = 25;
	
	private Tile[][] tiles;
	private Character[] characters;
	public static Player temp;
	public static char[][] hackyArray;
	
	public Level() {
		tiles = new Tile[HEIGHT][WIDTH];
		characters = new Character[1];
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
		characters[0] = new Player(new Location(1, 1));
	}
	
	public char[][] getLevel() {
		char[][] array = new char[HEIGHT][WIDTH];
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				array[y][x] = tiles[y][x].toString().charAt(0);
			}
		}
		Character c = characters[0];
		temp = (Player) characters[0];
		Location l = ((Player) c).getMyLocation();
		array[l.getY()][l.getX()] = c.toString().charAt(0);
		hackyArray = array;
		
		return array;
	}
}
