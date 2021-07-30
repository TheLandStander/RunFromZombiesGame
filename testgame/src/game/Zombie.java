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
	    	bounds.x = 20;	
	    	bounds.y = 20;
	    	bounds.height = 120;
	    	bounds.width = 100;
	    
		
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
			 
		 
			if( abs(x - handler.getGame().human.x) <= abs(400) && abs(y - handler.getGame().human.y) <= abs(400)) {
				
				
				 x = 10000; y = 10000;
				
					
					if(x == 10000 || y== 10000 ) {
						
						x += 0; y += 0;
						
					}
				 
				
				
				
			}
		 
if( abs(y - handler.getGame().human2.y) <= abs(300) && abs(x - handler.getGame().human2.x) <= abs(900) ) {
	
	 x = 10000; y = 10000;
	
		
		if(x == 10000 || y== 10000 ) {
			
			x += 0; y += 0;
			
		}
	 
				
			}
	
			
	 }
	
	


private float abs(float f) {
	return f;
		
		
	}



public void render(Graphics g) {
	
g.drawImage(Assets.Zombie,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

	}
		
		
	}



