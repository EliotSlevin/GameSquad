package gamelogic;

import java.awt.Point;

import tiles.Chest;
import tiles.Door;
import tiles.EmptyTile;
import tiles.Tile;
import character.Player;

public class GameLogic {
	private Tile[][] tiles;
	
	public GameLogic(Tile[][] tiles) {
		this.tiles = tiles;
	}
	
	public boolean moveLeft(Player p){
		Point now = p.getMyLocation();
		Point next = new Point(now.x-1, now.y);
		Tile tile = tiles[next.y][next.x];
		
		if(tile instanceof EmptyTile){
			p.setMyLocation(next);
			return true;
		} 
		return false;
	}
	
	public boolean moveRight(Player p){
		Point now = p.getMyLocation();
		Point next = new Point(now.x+1, now.y);
		Tile tile = tiles[next.y][next.x];
		
		if(tile instanceof EmptyTile){
			p.setMyLocation(next);
			return true;
		}
		return false;
	}
	
	public boolean moveUp(Player p){
		Point now = p.getMyLocation();
		Point next = new Point(now.x, now.y-1);
		Tile tile = tiles[next.y][next.x];
		
		if(tile instanceof EmptyTile){
			p.setMyLocation(next);
			return true;
		}
		return false;
	}
	
	public boolean moveDown(Player p){
		Point now = p.getMyLocation();
		Point next = new Point(now.x, now.y+1);
		Tile tile = tiles[next.y][next.x];
		
		if(tile instanceof EmptyTile){
			p.setMyLocation(next);
			return true;
		} 
		return false;
	}
	
	public boolean interact(Player p){
		Point now = p.getMyLocation();
		Point[] possibleMoves = new Point[4];
		
		possibleMoves[0] = new Point(now.x-1, now.y);
		possibleMoves[1] = new Point(now.x+1, now.y);
		possibleMoves[2] = new Point(now.x, now.y-1);
		possibleMoves[3] = new Point(now.x, now.y+1);
		
		for (int i = 0; i < 4; i++){
			Tile tile = tiles[possibleMoves[i].y][possibleMoves[i].x];
			if (tile instanceof Chest){
				openChest((Chest)tile, p);
				return true;
			} 
			if (tile instanceof Door){
				if (openDoor((Door) tile, p) == true){
					tiles[possibleMoves[i].y][possibleMoves[i].x] = new EmptyTile();
					return true;
				}
			} 
		}
		return false;
		
	}

	private boolean openDoor(Door tile, Player p) {
		if (p.getInven().size() > 0){
			tile.openDoor();
			return true;
		}
		return false;
	}

	private void openChest(Chest tile, Player p) {
		if (tile.getState() == true){
			tile.emptyChest();
			p.addToInven(tile.getKey());
			p.testInven();
		}		
	}
}
