package frogGame;



import java.io.IOException;



import frogActor.Animal;

import frogActor.Digit;
import frogHighscore.Highscore;
import frogWorld.MyStage;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Model of the game scene
 *	Where mostly are getter and setter
 */
public class Game_model {
	private Stage primaryStage;
	private MyStage background;
	private Scene sceneGame;
	private AnimationTimer timer;
	private Animal animal;
	private Highscore highscore;
	/**
	 * construct a Game_model constructor that takes in primaryStage as param
	 * @param primaryStage
	 */
	public Game_model(Stage primaryStage) {
		this.primaryStage = primaryStage;
		background = new MyStage();
		this.sceneGame = new Scene(background,600,800);
		animal = new Animal("file:src/image/froggerUp.png");
		this.highscore=new Highscore();
	}
	/**
	 * set a scene
	 * @param scene
	 */
	public void setScene(Scene scene){
        sceneGame= scene;      
     }
	/**
	 * return a scene
	 * @return
	 */
	public Scene getScene(){
        return sceneGame;      
     }
	/**
	 * set a stage
	 * @param primaryStage
	 */
	public void setStage(Stage primaryStage){
        this.primaryStage=primaryStage;      
     }
	/**
	 * return a stage
	 * @return
	 */
	public Stage getStage(){
        return primaryStage;      
     }
	/**
	 * set a Mystage
	 * @param background
	 */
	public void setMyStage(MyStage background) {
		this.background=background;
		
	}
	/**
	 * return Mystage
	 * @return Stage
	 */
	public MyStage getMyStage() {
		
		return background;
	}
	/**
	 * set a animal
	 * @param animal
	 */
	public void setAnimal(Animal animal) {
		this.animal=animal;
		
	}
	/**
	 * return a animal
	 * @return Animal 
	 */
	public Animal getAnimal() {
		
		return animal;
	} 
	
	
	/**
	 * start the timer
	 */
	public void start() {
		background.playMusic();
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
	 * monitor the scoring of the game
	 */
	public void createTimer() {
	    timer = new AnimationTimer() {
	        @Override
	        public void handle(long now) {
	        	if (animal.changeScore()) {
	        		setNumber(animal.getPoints());
	        	}
	        	if (animal.getStop()) {
	        		System.out.print("STOPP:");
	        		background.stopMusic();
	        		
	        		stop();
	        		background.stop();
	        		try {
						highscore.setScore(animal.getPoints());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        		
	        		highscore.getScore();
	        	}
	        }
	    };
	}
	/**
	 * setnumber
	 * @param n
	 */
	public void setNumber(int n) {
		int shift = 0;
		while (n > 0) {
			  int d = n / 10;
			  int k = n - d * 10;
			  n = d;
			  background.add(new Digit(k, 30, 360 - shift, 25));
			  shift+=30;
			}
	}
	
	
}
