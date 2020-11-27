package p4_group_8_repo;

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
		
		Mainmenu_model model = new Mainmenu_model(primaryStage);
		Mainmenu_view view = new Mainmenu_view();
		Mainmenu_controller controller = new Mainmenu_controller(model,view);
		//Mainmenu mainmenu = new Mainmenu();
		
		
		
		controller.runMainmenu();
	}
	
	
	
}