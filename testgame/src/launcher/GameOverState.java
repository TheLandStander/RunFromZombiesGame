package launcher;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.EntityManager;
import game.Game;
import game.KeyManager;
import game.Player;
import game.RoundTimer;

public class GameOverState extends State{
 Graphics g;




 
 
	public GameOverState(Handler handler) {
		super(handler);

		
	}

	
	
	

	public void tick() {
		
		handler.getGame().time --;
		
			if(State.currentState == this && handler.getKeyManager().restart) {
				 
				
				   State.setstate(handler.getGame().getGameState());
					Game game = new Game("ZOMBIE SURVIVAL",1280,720);
					handler.setGame(game);
					game.start();
				   handler.getGame().stop();
	              
				}
		     

			}
			
			

	public void render(Graphics g) {
		
		
		
		if(State.currentState == this) {
			
		
			
	
			
          g.drawImage(Assets.End, 0, 0,1280,720, null);
		
			RoundTimer.drawString(g, "YOU SURVIVED  " + (handler.getGame().getTime()/300) + "  ROUNDS" ,10, 350, false, Color.red,new Font("Arial",Font.BOLD,80));
		    
			RoundTimer.drawString(g, "PRESS E TO PLAY AGAIN" ,500, 400, false, Color.white,new Font("Arial",Font.BOLD,20));
			
			g.dispose();
		}
		
	}

}
