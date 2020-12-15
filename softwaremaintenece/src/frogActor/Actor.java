package frogActor;

import javafx.scene.image.ImageView;

import javafx.scene.input.InputEvent;

import java.util.ArrayList;

import frogWorld.World;

/**
 * The abstract class for all the objects 
 * in the frogger project.
 *
 */
public abstract class Actor extends ImageView{
	
	/**
	 * to get movement of the actor
	 * @param dx x-axis value
	 * @param dy y-axis value
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
     * check intersect
     * @param <A> Actor
     * @param cls Import actor
     * @return Array of the imported actor
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
    /**
     * 
     * @param <A> Actor
     * @param cls Import actor
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
    
    public void manageInput(InputEvent e) {
        
    }
    
    /**
     * 
     * @param <A> 
     * @param cls
     * @return
     */
    
    /**
     * abstract act method getting parameter now
     * @param now
     */
    public abstract void act(long now);

}
