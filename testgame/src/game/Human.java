package game;

import java.awt.Graphics;
import java.util.Random;

import launcher.Assets;
import launcher.Handler;

public class Human extends MovingEntity{
Random rand = new Random();
private int counter = 0;


    
	
	public Human(Handler handler, float x, float y) {
		super(handler, x, y, 80 , 80);
		bounds.x = 20;
	    bounds.y = 20;
	    bounds.height = 20;
	    bounds.width = 20;
	    		
	    		
		
	}
	
	
	
	 public void tick(){
		
		
int direction = rand.nextInt(4)  ;
		 
		 
		 if(handler.getGame().getTime() % 5 == 4) {
		 if (direction == 0) {   // UP
		    y -= 70;
		 }
		 
		 
		 }
		 
		 if(handler.getGame().getTime() % 5 == 4) {
		  if (direction == 1) { // DOWN
		    y += 70;
		 }
		 }
		 
		 
		 if(handler.getGame().getTime() % 5 == 4 ) {
		  if (direction == 2) { // left
			    x -= 70;
			 }
		 }
		 
		 if(handler.getGame().getTime() % 5 == 4) {
		  if (direction == 3) { // right
			    x += 70;
			 }
	 }
		 
		 
		 
		 if (x >= 1900 && x<= 5000) {
			 
			x -= 70;
			 
			 
		 }
		
		 
		 if (x <= 30 && x>= -5000) {
			 
			x += 70;
			 
		 }
		 
		 
		 if (y >= 1900 && y<= 5000) {
			 
			y -= 70;
			 
			 
		 }
		
		 
		 if (y <= 30 && y>= -5000) {
			 
			y += 70;
			 
			 
		 }

		 if(CheckEntityCollisions(bounds.x, bounds.y)) {
		counter ++;
			 
			       if(counter == 25) {
					handler.getWorlds().getEntityManager().getEntities().remove(this); }
			 
			 
			
		
		 }
		 
		 handler.getWorlds().getEntityManager().addEntity(new Shot(handler, this.x, this.y));
		 
		 
		 
	 }
	
	



public void render(Graphics g) {
	
g.drawImage(Assets.Human,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);



	}
		
		
	}



