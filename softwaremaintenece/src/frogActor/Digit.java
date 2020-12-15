package frogActor;

import javafx.scene.image.Image;
/**
 * Digit class
 * To diplay the number
 */
public class Digit extends Actor{
	private Image im1;
	
	/**
	 * overrided method from abstract class
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * construct and display digit with number, size,x-position and y-position
	 * 
	 * @param n number to be displaysd
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
