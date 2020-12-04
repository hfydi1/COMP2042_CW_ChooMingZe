package frogActor;

import javafx.scene.image.Image;

public class End extends Actor{
	private boolean activated = false;
	
	/**
	 * override act method and get now as parameter 
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	/**
	 * Create End crove by getting parameters x position ,y position 
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
