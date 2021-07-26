package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import launcher.Assets;
import launcher.Handler;

public class GameOver  {


	private int time = 0;
	
	
	public void gameEnded(Graphics g){
	
		RoundTimer.drawString(g, "YOU SURVIVED  " + (time/500) + "  ROUNDS", 700, 300, true, Color.red,new Font("Arial",Font.BOLD,90));
		
	
	}

	public void tick() {
		time++;
		
	}
	
	
	


}


