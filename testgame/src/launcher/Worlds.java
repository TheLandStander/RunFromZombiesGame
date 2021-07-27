package launcher;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.AttributedCharacterIterator;
import java.util.Random;
import java.util.Timer;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game.Entity;
import game.EntityManager;
import game.Game;
import game.Player;
import game.Zombie;



public class Worlds {
	
	private int width, height;
	private int[][] tiles;
	private int spawnX, spawnY;
    private Handler handler;
	private EntityManager entityManager;
    private Random rand;
    private Window window;
    
 
    
    
	public Worlds(Handler handler,String path) {
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, (int) spawnY, (int)  spawnX));
		
		
		loadWorlds(path);
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
	}
	
	
	
     private void loadWorlds(String path) {	
		
		
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y++) {
		for(int x = 0; x < width; x++) {
		tiles[x][y]	= Utils.parseInt(tokens [((y * width) + x) + 4]);	
		}
		
	}
	
	
     }
   
     
	public void tick() {
	
	entityManager.tick();	
	
	if(handler.getGame().getTime() % 1000 == 300) {
		    entityManager.addEntity(new Zombie(handler, 960, 960));
		    entityManager.addEntity(new Zombie(handler, 960, 960));
		    entityManager.addEntity(new Zombie(handler, 960, 960));
		    entityManager.addEntity(new Zombie(handler, 960, 960));
		    
	}	
		
	}



	public void render(Graphics g) {
		for(int y = 0; y < height; y++)
		for(int x = 0; x < width; x++) {
			
			getTiles(x,y).render(g,(int) (x * Tiles.TILEWIDTH - handler.getCamera().getxOffset()),(int) ( y * Tiles.TILEHEIGHT - handler.getCamera().getyOffset()));
			entityManager.render(g);
			
		}
		
	}
	
	public Tiles getTiles(int x, int y) {
		
		if(x < 0 || y < 0 || x>= width|| y>= height)
		return Tiles.BloodTile;
		Tiles t = Tiles.Tiles[tiles[x][y]];
		if(tiles == null)
			return Tiles.BloodTile;
		return t;
	}
	
	public int getHeight() {
		
		return height;
	}
	
	
	public int getWidth() {
		
		return width;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	


	
}


