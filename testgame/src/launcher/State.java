package launcher;

import java.awt.Graphics;

import game.Game;

public abstract class State {

	protected static State currentState = null;	
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	protected Handler handler;
	public State (Handler handler) {
	this.handler = handler;
	}

	
public static void setstate(State state){
currentState = state;	
	
} 

public static State getstate() {
	return currentState;
	
}


	
}
