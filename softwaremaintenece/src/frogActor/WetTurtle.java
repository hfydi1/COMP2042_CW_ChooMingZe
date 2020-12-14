package frogActor;

import javafx.scene.image.Image;

public class WetTurtle extends Actor{
	private Image turtle1;
	private Image turtle2;
	private Image turtle3;
	private Image turtle4;
	private double speed;
	int i = 1;
	private boolean bool = true;
	private boolean sunk = false;
	/**
	 * 
	 * override act method and get now as parameter to set current wetturtle's position/state
	 */
	@Override
	public void act(long now) {

				if (now/900000000  % 4 ==0) {
					setImage(turtle2);
					sunk = false;
					
				}
				else if (now/900000000 % 4 == 1) {
					setImage(turtle1);
					sunk = false;
				}
				else if (now/900000000 %4 == 2) {
					setImage(turtle3);
					sunk = false;
				} else if (now/900000000 %4 == 3) {
					setImage(turtle4);
					sunk = true;
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * Create turtle by getting parameters x position ,y position ,speed , width and height
	 * 
	 * @param xpos x-position
	 * @param ypos y-position
	 * @param s2 speed
	 * @param w width
	 * @param h height
	 */
	public WetTurtle(int xpos, int ypos, double s2, int w, int h) {
		turtle1 = new Image("file:src/image/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/image/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:src/image/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:src/image/TurtleAnimation4Wet.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s2;
		setImage(turtle2);
	}
	
	/**
	 * 
	 * access the state of turtle
	 * @return the state or turtle is sunk or not in boolean
	 */
	public boolean isSunk() {
		return sunk;
	}
}
