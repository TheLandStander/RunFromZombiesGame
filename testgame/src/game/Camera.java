package game;

import launcher.Handler;
import launcher.Tiles;

public class Camera {

	private float xOffset, yOffset;
	private Handler handler;
	public Camera(Handler handler,float xOffset, float yOffset) {
	this.xOffset = xOffset;
	this.yOffset = yOffset;	
	this.handler = handler;
	}
	
	public void noWhitespace() {
		
		if (xOffset < 0) {
			xOffset = 0; 
		}else if(xOffset > handler.getWorlds().getWidth() * Tiles.TILEWIDTH - handler.getWidth()) {
			
			xOffset = handler.getWorlds().getWidth() * Tiles.TILEWIDTH - handler.getWidth();
		}
					
					
			if(yOffset < 0) {
				yOffset = 0;
				
			} else if (yOffset > handler.getWorlds().getHeight() * Tiles.TILEHEIGHT - handler.getHeight()) {
				
				yOffset = handler.getWorlds().getHeight() * Tiles.TILEHEIGHT - handler.getHeight();
			}
		}
		
	
	
	
	public void centerOnEntity(Entity e) {
		
		xOffset = e.getX() - handler.getWidth() /2 + e.getWidth() /2;
		yOffset = e.getY() - handler.getHeight() /2 + e.getHeight() /2;
		noWhitespace();
		
	}
	
	
	public void move(float xAmt, float yAmt) {
		xOffset += xAmt;
		yOffset += yAmt;
		noWhitespace();
		
	}

	public float getyOffset() {
		return yOffset;
	}

	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}

	public float getxOffset() {
		return xOffset;
		
	}

	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}
	
	
	
}
