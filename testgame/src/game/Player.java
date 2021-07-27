package game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import launcher.Assets;
import launcher.Handler;


public class Player extends Creature{

	public Player(Handler handler, float x, float y) {
		super(handler,x, y, Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		speed = 15.0f;
		bounds.x = 20;
	    bounds.y = 20;
	    bounds.height = 20;
	    bounds.width = 20;
		
		
	}
	
	public void tick() {
	getInput();
	move();
	handler.getCamera().centerOnEntity(this);	
	
	}
	
	private void getInput() {
		
		
	xMove = 0;
	yMove = 0;
	
	if (handler.getKeyManager().up)
	yMove= -speed;

	if (handler.getKeyManager().down)
		yMove = speed;
	
	if (handler.getKeyManager().right)
		xMove = speed;
	
	if (handler.getKeyManager().left)
		xMove = -speed;
	
	}

	
	public void render(Graphics g) {
		
		
		
		g.drawImage(Assets.Player,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

		
	}

	
}
