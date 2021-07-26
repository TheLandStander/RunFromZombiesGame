package game;
import java.awt.Canvas;
import game.Camera;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;

import launcher.Assets;
import launcher.GameState;
import launcher.Handler;
import launcher.State;
import launcher.Window;
public class Game implements Runnable {

private boolean running = false;	
public Window Window;	
private int width, height;
public String title;
private Thread thread;
private Handler handler;
private State gameState;
private KeyManager keymanager;
private int time = 0;
private int xMove = 0;
private int yMove = 0;

public boolean isRunning() {
	return running;
}

public void setRunning(boolean running) {
	this.running = running;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}


public State getGameState() {
	return gameState;
}

public void setGameState(State gameState) {
	this.gameState = gameState;
}

public BufferStrategy getBs() {
	return bs;
}

public void setBs(BufferStrategy bs) {
	this.bs = bs;
}

public Graphics getG() {
	return g;
}

public void setG(Graphics g) {
	this.g = g;
}

public void setKeymanager(KeyManager keymanager) {
	this.keymanager = keymanager;
}

public void setCamera(Camera camera) {
	this.camera = camera;
}

public Game(String title, int width, int height){
	this.width = width;
	this.height = height;
	this.title = title;

	
	
}

public KeyManager getKeymanager(){
return keymanager;


}

private Camera camera;

//GAME LOOP
public void run() {
init();

int FPS = 60;
double timePerTick = 1000000000 /FPS;
double delta = 0;
long now;
long lastTime = System.nanoTime();
while(running) {
	now = System.nanoTime();
	delta += (now - lastTime) / timePerTick;
	lastTime = now;
	if(delta >= 1) {	
	delta--;
	tick();
	render();
	


}


}


}


private void tick() {
	keymanager.tick();
	if(State.getstate() != null)
	State.getstate().tick();
	time++;
	
}


private BufferStrategy bs;
private Graphics g;


private void render(){

	
bs = Window.getCanvas().getBufferStrategy();
if(bs == null) {
	Window.getCanvas().createBufferStrategy(3);	
	return;
}
	g = bs.getDrawGraphics();
 
	if(State.getstate() != null)
	State.getstate().render(g);
	
	
	RoundTimer.drawString(g, "Round: " + (time/500), 80, 10, true, Color.black,new Font("Arial",Font.BOLD,30));
	

	bs.show();
	g.dispose();

}

public Camera getCamera() {
	return camera;
	

}




private void init() {
	Window = new Window(title,width,height);
	
	Assets.init();
	
	handler = new Handler(this);
	
	camera = new Camera(handler, 0,0);
	
	gameState = new GameState(handler);
	
	State.setstate(gameState);
	
	keymanager  = new KeyManager();
	
	Window.getFrame().addKeyListener(keymanager);
	
	
	
}
public synchronized void start() {
	thread = new Thread(this);
	thread.start();
	running = true;
	if(running) 
		return;
}

public synchronized void stop() {
	try {
		thread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	if(!running)
		return;
	running = false;
	
	
		
}

}

