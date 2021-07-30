package game;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Rectangle;

import launcher.Handler;

public abstract class Entity {

protected Handler handler;
protected float x,y;
protected int height, width;
protected Rectangle bounds;

public Entity(Handler handler,float x, float y, int height, int width) {
	this.handler = handler;
	this.x = x;
	this.y = y;		
	this.width = width;
	this.height = height;
	bounds = new Rectangle(0,0,width,height);
}
	
public Rectangle getCollisionBounds(float xOffset, float yOffset) {
	return new Rectangle( (int)   (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
	
}

public boolean CheckEntityCollisions(float xOffset, float yOffset) {
	for(Entity e: handler.getWorlds().getEntityManager().getEntities()) {
		
		if(e.equals(this))
			continue;
		
		
		if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
			return true;
		
	}
	return false;
}

public float getX() {
	return x;
}

public void setX(float x) {
	this.x = x;
}

public float getY() {
	return y;
}

public void setY(float y) {
	this.y = y;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public abstract void tick();
public abstract void render (Graphics g);
	
	

}
