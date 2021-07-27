package launcher;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;



public class Assets {

	
public static BufferedImage Player, Zombie , Border , Tile,Tile2;	


public static void init() {
	
	Player = Window.loadimage("/textures/player.png");
	Zombie = Window.loadimage("/textures/zombie.png");
	Tile = Window.loadimage("/textures/tile.png");
	Border = Window.loadimage("/textures/border.png");
	Tile2 = Window.loadimage("/textures/tile2.png");
}






}
