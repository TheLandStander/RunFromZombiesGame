package game;


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
		speed = 1; 
		bounds.x = 0;
	    bounds.y = 64;
	    bounds.height = 10;
	    bounds.width = 90;
	    		
	    		
		
	}
	
	
	
	 public void tick(){
		
		
		
		 int direction = rand.nextInt(4);
		 time++;
		 
		 if(time % 60 == 30) {
		 if (direction == 0) {   // UP
		    y -= 100;
		 } 
		 }
		 
		 if(time % 60 == 30) {
		  if (direction == 1) { // DOWN
		    y += 100;
		 }
		 }
		 
		 
		 if(time % 60 == 25) {
		  if (direction == 2) { // left
			    x -= 100;
			 }
		 }
		 
		 if(time % 60 == 25) {
		  if (direction == 3) { // right
			    x += 100;
			 }
	 }
	 
	 }
	
	
	 


public void render(Graphics g) {
g.drawImage(Assets.Zombie,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

	}
		
		
	}



