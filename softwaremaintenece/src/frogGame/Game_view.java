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
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.image.Image;
/**
 * View of the game scene
 * Where it is used to display everything
 */
public class Game_view {
	
	public Game_view() {
		
		
	}
	/**
	 * 
	 * create start by getting parameters primarystage,background,scene and animal
	 * @param primaryStage Game's stage
	 * @param background Game's background
	 * @param scene Games's scene
	 * @param animal frog
	 * @param s1 speed1 value
	 * @param s2 speed2 value
	 * @param s3 speed3 value
	 * @param s4 speed4 value
	 * @param s5 speed5 value
	 * @throws Exception
	 */
	public void start(Stage primaryStage, MyStage background, Scene scene,Animal animal,double s1,double s2, double s3, double s4 ,double s5) throws Exception {
		
	
		background.add(new BackgroundImage("file:src/image/backImageEdit.jpg"));
		
		//Row1
		background.add(new Log("file:src/image/log3.png", 150, 0, 166, s1));
		background.add(new Log("file:src/image/log3.png", 150, 220, 166, s1));
		background.add(new Log("file:src/image/log3.png", 150, 440, 166, s1));
		
		//Row2
		background.add(new WetTurtle(600, 217, s2, 130, 130));
		background.add(new WetTurtle(400, 217, s2, 130, 130));
		background.add(new WetTurtle(200, 217, s2, 130, 130));
		
		//Row3
		background.add(new Log("file:src/image/logs.png", 300, 0, 276, s3));
		background.add(new Log("file:src/image/logs.png", 300, 400, 276, s3));
		
		//Row4
		background.add(new Log("file:src/image/log3.png", 150, 50, 329, s1));
		background.add(new Log("file:src/image/log3.png", 150, 270, 329, s1));
		background.add(new Log("file:src/image/log3.png", 150, 490, 329, s1));	
		
		//Row5
		background.add(new Turtle(500, 376, s2, 130, 130));
		background.add(new Turtle(300, 376, s2, 130, 130));
		background.add(new WetTurtle(700, 376, s2, 130, 130));		
		
		//Row6
		background.add(new Obstacle("file:src/image/car1Left.png", 500, 490, s4, 50, 50));
		
		//Row7
		background.add(new Obstacle("file:src/image/truck2Right.png", 0, 540, s5, 200, 200));
		background.add(new Obstacle("file:src/image/truck2Right.png", 500, 540, s5, 200, 200));
		
		//Row8
		background.add(new Obstacle("file:src/image/car1Left.png", 100, 597, s2, 50, 50));
		background.add(new Obstacle("file:src/image/car1Left.png", 250, 597, s2, 50, 50));
		background.add(new Obstacle("file:src/image/car1Left.png", 400, 597, s2, 50, 50));
		background.add(new Obstacle("file:src/image/car1Left.png", 550, 597, s2, 50, 50));
		
		//Row9
		background.add(new Obstacle("file:src/image/truck1"+"Right.png", 0, 649, s5, 120, 120));
		background.add(new Obstacle("file:src/image/truck1"+"Right.png", 300, 649, s5, 120, 120));
		background.add(new Obstacle("file:src/image/truck1"+"Right.png", 600, 649, s5, 120, 120));	
		
		
		
		background.add(new Digit(0, 30, 360, 25));
		
		background.add(new End(13,96));
		background.add(new End(141,96));
		background.add(new End(141 + 141-13,96));
		background.add(new End(141 + 141-13+141-13+1,96));
		background.add(new End(141 + 141-13+141-13+141-13+3,96));
		
		background.add(animal);
		
		 Button quit= new Button("Quit Game");
		 quit.setOnAction(e -> Platform.exit());
		    
		
		 quit.setLayoutX(270);
		 quit.setLayoutY(750);
		
		background.getChildren().add(quit);
		scene.getStylesheets().add("frogStylesheet/game_stylesheet.css");
		
		
		background.start();
		primaryStage.setScene(scene);
		primaryStage.show();
		 
		
		
	}
	
	
	
	
	

}
