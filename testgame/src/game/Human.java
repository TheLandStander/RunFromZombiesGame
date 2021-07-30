package game;

import java.awt.Graphics;
import java.util.Random;

import launcher.Assets;
import launcher.Handler;

public class Human extends MovingEntity{
Random rand = new Random();
  



    
	
	public Human(Handler handler, float x, float y) {
		super(handler, x, y, 80 , 80);
		bounds.x = 0;
	    bounds.y = 0;
	    bounds.height = 0;
	    bounds.width = 0;
	    		
	    		
		
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

		 if( abs(x - handler.getGame().zomb.x) <= abs(300) && abs(y - handler.getGame().zomb.y) <= abs(300)) {
			
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
	
g.drawImage(Assets.Human,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);



	}
		
		
	}



