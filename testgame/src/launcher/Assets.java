package launcher;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;



public class Assets {

	
public static BufferedImage Player, Zombie , Border , Tile;	


public static void init() {
	
	Player = Window.loadimage("/textures/player.png");
	Zombie = Window.loadimage("/textures/zombie.png");
	Tile = Window.loadimage("/textures/tile.png");
	Border = Window.loadimage("/textures/border.png");
	
}






}
