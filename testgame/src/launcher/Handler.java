package launcher;
import launcher.Worlds;

import java.awt.image.BufferedImage;

import game.Camera;
import game.Creature;
import game.Entity;
import game.EntityManager;
import game.Game;
import game.Human;
import game.KeyManager;
import game.Zombie;

public class Handler {

	private Game game;
	private Worlds worlds;
	
	public Camera getCamera() {
		
		return game.getCamera();
	}
	
	
	public KeyManager getKeyManager () {
		return game.getKeymanager();
		
	}
	
	public int getWidth() {
		
		return game.getWidth();
	}
	
	public int getHeight() {
		
		return game.getHeight();
	}
	
	
	public Handler(Game game) {
		this.game = game;
		
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Worlds getWorlds() {
		return worlds;
	}

	public void setWorlds(Worlds worlds) {
		this.worlds = worlds;
	}



	
}
