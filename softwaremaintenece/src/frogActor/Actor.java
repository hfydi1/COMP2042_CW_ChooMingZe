package frogActor;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;

import frogWorld.World;


public abstract class Actor extends ImageView{
	
	/**
	 * to get movement
	 * @param dx x value
	 * @param dy y value
	 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    /**
     * access the world
     * @return world
     */
    public World getWorld() {
        return (World) getParent();
    }
	/**
	 * access the width
	 * @return width
	 */
    public double getWidth() {
        return this.getBoundsInLocal().getWidth();
    }
    /**
     * return the height
     * @return height
     */
    public double getHeight() {
        return this.getBoundsInLocal().getHeight();
    }
    /**
     * 
     * @param <A>
     * @param cls
     * @return
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    public void manageInput(InputEvent e) {
        
    }
    
    /**
     * 
     * @param <A>
     * @param cls
     * @return
     */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }
    /**
     * abstract act method getting parameter now
     * @param now
     */
    public abstract void act(long now);

}
