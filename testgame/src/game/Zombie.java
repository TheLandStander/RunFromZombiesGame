package game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import launcher.Assets;
import launcher.Handler;
import launcher.Tiles;

public class Zombie extends MovingEntity{

	Random rand = new Random();
    
	
    
	
	public Zombie(Handler handler, float x, float y) {
		super(handler, x, y, 120 ,100);
		bounds.x = 0;
	    bounds.y = 64;
	    bounds.height = 10;
	    bounds.width = 90;
	    		
	    		
		
	}
	
	
	
	 public void tick(){
		
		
		
		 int direction = rand.nextInt(4)  ;
		 
		 
		 if(handler.getGame().getTime() % 2 == 1) {
		 if (direction == 0) {   // UP
		    y -= 50;
		 }
		 
		 
		 }
		 
		 if(handler.getGame().getTime() % 2 == 1) {
		  if (direction == 1) { // DOWN
		    y += 50;
		 }
		 }
		 
		 
		 if(handler.getGame().getTime() % 2 == 1) {
		  if (direction == 2) { // left
			    x -= 50;
			 }
		 }
		 
		 if(handler.getGame().getTime() % 2 == 1) {
		  if (direction == 3) { // right
			    x += 50;
			 }
	 }
		 
		 
		 
		 if (x >= 1900) {
			 
			x -= 50; 
			 
			 
		 }
		
		 
		 if (x <= 30) {
			 
			x += 50; 
			 
			 
		 }
		 
		 
		 if (y >= 1900) {
			 
			y -= 50; 
			 
			 
		 }
		
		 
		 if (y <= 30) {
			 
			y += 50; 
			 
			 
		 }
		 
		 
		 
		 
	 
	 }
	
	


public void render(Graphics g) {
	
g.drawImage(Assets.Zombie,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

	}
		
		
	}



