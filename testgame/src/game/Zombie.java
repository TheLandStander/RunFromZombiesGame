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
    private float time = 0;
    
	
    
	
	public Zombie(Handler handler, float x, float y) {
		super(handler, x, y, 120 ,100);
		bounds.x = 90;
	    bounds.y = 64;
	    bounds.height = 10;
	    bounds.width = 90;
	    		
	    		
		
	}
	
	
	
	 public void tick(){
		
		
		
		 int direction = rand.nextInt(4)  ;
		 time++;
		 
		 if(time % 2 == 1) {
		 if (direction == 0) {   // UP
		    y -= 50;
		 }
		 
		 
		 }
		 
		 if(time % 2 == 1) {
		  if (direction == 1) { // DOWN
		    y += 50;
		 }
		 }
		 
		 
		 if(time % 2 == 1) {
		  if (direction == 2) { // left
			    x -= 50;
			 }
		 }
		 
		 if(time % 2 == 1) {
		  if (direction == 3) { // right
			    x += 50;
			 }
	 }
		 
		 
		 
		 if (x >= 1920) {
			 
			x -= 900; 
			 
			 
		 }
		
		 
		 if (x <= 0) {
			 
			x += 900; 
			 
			 
		 }
		 
		 
		 if (y >= 1920) {
			 
			y -= 900; 
			 
			 
		 }
		
		 
		 if (y <= 0) {
			 
			y += 900; 
			 
			 
		 }
		 
		 
		 
		 
	 
	 }
	
	


public void render(Graphics g) {
	
g.drawImage(Assets.Zombie,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

	}
		
		
	}



