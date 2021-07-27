package launcher;
import game.Game;
public class Launcher {
	
public static void main(String[] args) {


Game game = new Game("ZOMBIE SURVIVAL", 1280, 720);
game.start();	
}

}
