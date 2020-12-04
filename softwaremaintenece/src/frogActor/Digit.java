package frogActor;

import javafx.scene.image.Image;

public class Digit extends Actor{
	private int dim;
	private Image im1;
	
	/**
	 * override act method and get now as parameter 
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * construct a digit with instance of number, size,x-position and y-position
	 * 
	 * @param n number
	 * @param dim size
	 * @param x x-position
	 * @param y y-position
	 * 
	 */
	public Digit(int n, int dim, int x, int y) {
		im1 = new Image("file:src/image/"+n+".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}
	
}
