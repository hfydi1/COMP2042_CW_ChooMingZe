package frogActor;

import javafx.scene.image.Image;
/**
 * End class
 * Responsible for the ending of the game
 */
public class End extends Actor{
	private boolean activated = false;
	
	/**
	 * overrided method from abstract class
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	/**
	 * Create End crove by getting parameters x position and y position 
	 * of the image and set it.
	 * @param x x-postion
	 * @param y y-position
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/image/End.png", 60, 60, true, true));
	}
	
	/**
	 * 
	 * Create setEnd when frog has reached
	 */
	public void setEnd() {
		setImage(new Image("file:src/image/FrogEnd.png", 70, 70, true, true));
		activated = true;
	}
	/**
	 * access if End is activated
	 * @return activated in boolean
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
