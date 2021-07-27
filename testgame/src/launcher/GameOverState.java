package launcher;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import game.RoundTimer;

public class GameOverState extends State{
 private int timer = 0;
	
	
	
	
	
	public GameOverState(Handler handler) {
		super(handler);
		
	}

	

	
	public void tick() {
		

		timer ++;
		
		if(timer == 5) {
			
			Thread.currentThread().stop();
			
		}
		
		
		
	}

	
	public void render(Graphics g) {
	
      
		RoundTimer.drawString(g, "YOU SURVIVED  " + (handler.getGame().getTime()/167) + "  ROUNDS" ,600, 300, true, Color.red,new Font("Arial",Font.BOLD,80));
		
		
		
		
	}

}
