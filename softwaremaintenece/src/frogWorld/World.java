package frogWorld;


import java.util.ArrayList;

import java.util.List;

import frogActor.Actor;
import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

/**
 * Layout for the game
 *
 */
public abstract class World extends Pane {
    private AnimationTimer timer;
    /**
     * handle the game when it is running
     */
    public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {

			@Override
			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
				}
				
			}
    		
		});
    }
    /**
     * create a timer when game starts
     */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);
                
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
      
            }
        };
    }
    /**
     * start the timer
     */
    public void start() {
    	createTimer();
        timer.start();
    }
    /**
     * stop the timer
     */
    public void stop() {
        timer.stop();
    }
    /**
     * add an actor
     * @param actor
     */
    public void add(Actor actor) {
        getChildren().add(actor);
    }
    /**
     * remove an actor
     * @param actor
     */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }
    /**
     * 
     * @param <A>
     * @param cls
     * @return array
     */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        return someArray;
    }
    /**
     * abstract act method getting parameter now
     * @param now
     */
    public abstract void act(long now);
}
