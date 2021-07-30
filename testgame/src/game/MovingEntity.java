package game;

import launcher.Handler;

public abstract class MovingEntity extends Entity{
private Zombie zombie;
private Human human;
	

		public MovingEntity(Handler handler, float x, float y, int height, int width) {
		super(handler, x, y, height, width);
	
		
		

		}
	
		
		public void tick() {
			
			zombie.tick();
			human.tick();
			
			
		}
		
		
}
