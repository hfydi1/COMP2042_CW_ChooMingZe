package frogActor;

import javafx.scene.image.Image;
/**
 * Obstacle class
 * Responsible for moving obstacles such as trucks and cars 
 */
public class Obstacle extends Actor {
	private double speed;
	
	/**
	 * override act method and get now as parameter to set current obstacle's position/state
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}
	/**
	 * 
	 * Create obstacle by getting parameters imagelink,x position ,y position ,speed , width and height
	 * @param imageLink link of the images
	 * @param xpos x-position
	 * @param ypos y-position
	 * @param s4 speed
	 * @param w width
	 * @param h height
	 */
	public Obstacle(String imageLink, int xpos, int ypos, double s4, int w, int h) {
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s4;
	}

}
