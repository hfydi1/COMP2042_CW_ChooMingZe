package frogActor;

import javafx.scene.image.Image;
/**
 * Log class
 * Responsible for the movement of logs
 * Acts as a platform
 */
public class Log extends Actor {

	private double speed;
	
	/**
	 * override act method and get now as parameter to set current log's position/state
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
	/**
	 * construct a log with imagelink, size, x-position ,y-posistion and speed
	 * @param imageLink link to images
	 * @param size size of image
	 * @param xpos x-position
	 * @param ypos y-position
	 * @param s speed
	 */
	public Log(String imageLink, int size, int xpos, int ypos, double s) {
		setImage(new Image(imageLink, size,size, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
	/**
	 * access position of the log
	 * @return the position in boolean
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}
