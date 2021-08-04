package launcher;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;



public class Assets {

	
public static BufferedImage Player, Zombie ,Human,Human2, Border , Tile, Tile2, End,Shot;	


public static void init() {
	
	Player = Window.loadimage("/textures/player.png");
	Zombie = Window.loadimage("/textures/zombie.png");
	Human = Window.loadimage("/textures/human.png");
	Tile = Window.loadimage("/textures/tile.png");
	Border = Window.loadimage("/textures/border.png");
	Tile2 = Window.loadimage("/textures/tile2.png");
	Human2 = Window.loadimage("/textures/human2.png");
	End  = Window.loadimage("/textures/end.png");
	Shot = Window.loadimage("/textures/shot.png");
	
}






}
