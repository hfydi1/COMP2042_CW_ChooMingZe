package frogGame;




import frogActor.Animal;
import frogActor.BackgroundImage;
import frogActor.Digit;
import frogActor.End;
import frogActor.Log;
import frogActor.Obstacle;
import frogActor.Turtle;
import frogActor.WetTurtle;
import frogWorld.MyStage;
import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class Game_view {
	
	public Game_view() {
		
		
	}
	/**
	 * create start by getting parameters primarystage,background,scene and animal
	 * @param primaryStage 
	 * @param background
	 * @param scene
	 * @param animal
	 * @throws Exception
	 */
	public void start(Stage primaryStage, MyStage background, Scene scene,Animal animal) throws Exception {
		
	
		background.add(new BackgroundImage("file:src/image/backImageEdit.jpg"));
		
		background.add(new Log("file:src/image/log3.png", 150, 0, 166, 0.75));
		background.add(new Log("file:src/image/log3.png", 150, 220, 166, 0.75));
		background.add(new Log("file:src/image/log3.png", 150, 440, 166, 0.75));
		
		background.add(new Log("file:src/image/logs.png", 300, 0, 276, -2));
		background.add(new Log("file:src/image/logs.png", 300, 400, 276, -2));
		
		background.add(new Log("file:src/image/log3.png", 150, 50, 329, 0.75));
		background.add(new Log("file:src/image/log3.png", 150, 270, 329, 0.75));
		background.add(new Log("file:src/image/log3.png", 150, 490, 329, 0.75));
	
		
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
	
		
		background.add(new End(13,96));
		background.add(new End(141,96));
		background.add(new End(141 + 141-13,96));
		background.add(new End(141 + 141-13+141-13+1,96));
		background.add(new End(141 + 141-13+141-13+141-13+3,96));
		
		background.add(animal);
		
		background.add(new Obstacle("file:src/image/truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/image/truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/image/truck1"+"Right.png", 600, 649, 1, 120, 120));
	
		background.add(new Obstacle("file:src/image/car1Left.png", 100, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/image/car1Left.png", 250, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/image/car1Left.png", 400, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/image/car1Left.png", 550, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/image/truck2Right.png", 0, 540, 1, 200, 200));
		background.add(new Obstacle("file:src/image/truck2Right.png", 500, 540, 1, 200, 200));
		background.add(new Obstacle("file:src/image/car1Left.png", 500, 490, -5, 50, 50));
		
		background.add(new Digit(0, 30, 360, 25));
		
		 Button quit= new Button("Quit Game");
		 quit.setOnAction(e -> Platform.exit());
		    
		
		 quit.setLayoutX(270);
		 quit.setLayoutY(750);
		
		background.getChildren().add(quit);
		
		
		background.start();
		primaryStage.setScene(scene);
		primaryStage.show();
		 
		
		
	}
	
	
	
	
	

}
