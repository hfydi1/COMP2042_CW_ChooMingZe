package frogActor;

import javafx.scene.image.Image;

public class Turtle extends Actor{
	private Image turtle1;
	private Image turtle2;
	private Image turtle3;
	private double speed;
	private int i = 1;
	private boolean bool = true;
	/**
	 * 
	 *  override act method and get now as parameter to set current turtle's position/state
	 */
	@Override
	public void act(long now) {

				if (now/900000000  % 3 ==0) {
					setImage(turtle2);
					
				}
				else if (now/900000000 % 3 == 1) {
					setImage(turtle1);
					
				}
				else if (now/900000000 %3 == 2) {
					setImage(turtle3);
					
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	/**
	 * 
	 * Create turtle by getting parameters x position ,y position ,speed , width and height
	 * @param xpos x position
	 * @param ypos y position
	 * @param s2  speed
	 * @param w width
	 * @param h height
	 */
	public Turtle(int xpos, int ypos, double s2, int w, int h) {
		turtle1 = new Image("file:src/image/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/image/TurtleAnimation2.png", w, h, true, true);
		turtle3 = new Image("file:src/image/TurtleAnimation3.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s2;
		setImage(turtle2);
	}
}
