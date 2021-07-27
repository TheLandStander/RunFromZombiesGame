package launcher;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tiles {

public static Tiles[] Tiles = new Tiles[256];
	public static Tiles BorderTile = new BorderTile(0);
	public static Tiles BloodTile = new Bloodtile(1);
	public static Tiles BloodTile2 = new BloodTile2(2);
	
public static final int TILEWIDTH = 64, TILEHEIGHT = 64;

	
	
protected BufferedImage texture;
protected final int id;
	
	public Tiles(BufferedImage texture,int id) {
		this.texture = texture;
		this.id = id;
		
		Tiles[id] = this;
	}
	
	public int getid(){
		return id;
	}
	
	public boolean isSolid() {
		
		return false;
		
	}
	
	public void tick(){
		
		
		
	}
	
	public void render(Graphics g, int x , int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	
}
