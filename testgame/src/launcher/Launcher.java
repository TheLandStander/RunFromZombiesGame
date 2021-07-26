package launcher;
import game.Game;
public class Launcher {
	
public static void main(String[] args) {


Game game = new Game("Test game", 1280, 720);
game.start();	
}

}
