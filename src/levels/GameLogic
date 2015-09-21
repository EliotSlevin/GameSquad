package controller;

import tiles.EmptyTile;
import tiles.Tile;
import character.Location;
import character.Player;

public class GameLogic {
	
	//create and populate the list of players

	public boolean moveLeft(Player p, Tile tile){
		if(tile instanceof EmptyTile){
			Location temp = p.getMyLocation();
			p.setMyLocation(new Location(temp.getX() - 1, temp.getY()));
			return true;
		}
		else{
			return false;
		}
	}
}
