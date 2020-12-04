package frogGame;



import java.io.IOException;

import frogActor.Animal;

import frogActor.Digit;
import frogHighscore.Highscore;
import frogWorld.MyStage;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Game_model {
	private Stage primaryStage;
	private MyStage background;
	private Scene sceneGame;
	private AnimationTimer timer;
	private Animal animal;
	private Highscore highscore;
	
	public Game_model(Stage primaryStage) {
		this.primaryStage = primaryStage;
		background = new MyStage();
		this.sceneGame = new Scene(background,600,800);
		animal = new Animal("file:src/image/froggerUp.png");
		this.highscore=new Highscore();
	}
	
	public void setScene(Scene scene){
        sceneGame= scene;      
     }
	
	public Scene getScene(){
        return sceneGame;      
     }
	
	public void setStage(Stage primaryStage){
        this.primaryStage=primaryStage;      
     }
	
	public Stage getStage(){
        return primaryStage;      
     }
	
	public void setMyStage(MyStage background) {
		this.background=background;
		
	}
	
	public MyStage getMyStage() {
		
		return background;
	}
	
	public void setAnimal(Animal animal) {
		this.animal=animal;
		
	}
	
	public Animal getAnimal() {
		
		return animal;
	} 	
	
	
	public void start() {
		background.playMusic();
		createTimer();
	    timer.start();
	}
	
	public void stop() {
	    timer.stop();
	}
	
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
	        		/*
	        		Alert alert = new Alert(AlertType.INFORMATION);
	        		alert.setTitle("You Have Won The Game!");
	        		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
	        		
	        		alert.setContentText("Highest Possible Score: 800");
	        		alert.show();
	        		*/
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
