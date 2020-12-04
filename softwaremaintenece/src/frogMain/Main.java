package frogMain;

import java.io.File;




import java.util.List;
import frogMainmenu.Mainmenu_controller;
import frogMainmenu.Mainmenu_model;
import frogMainmenu.Mainmenu_view;
import frogActor.Animal;
import frogActor.BackgroundImage;
import frogActor.Digit;
import frogActor.End;
import frogActor.Log;
import frogActor.Obstacle;
import frogActor.Turtle;
import frogActor.WetTurtle;
import frogGame.frogGame;
import frogInfo.Info;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start (Stage primaryStage) throws Exception{
		
		frogScenemanager scenemanager = new frogScenemanager(primaryStage);
		scenemanager.startMainMenu();
		
	}
	
	
	
}