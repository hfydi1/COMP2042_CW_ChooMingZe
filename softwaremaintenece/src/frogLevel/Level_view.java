package frogLevel;

import java.util.Collection;

import frogActor.BackgroundImage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Level_view {
	public Level_view() {
		
	};
	
	public void levelStart(Stage stage, Group group,Scene sceneLevel, Button easy,Button medium,Button hard) throws Exception {
		
		//Group group = new Group();roup.getChildren().add(new BackgroundImage("file:src/image/iKogsKW.png"));
		group.getChildren().add(new BackgroundImage("file:src/image/iKogsKW.png"));
		Text text = new Text("Please Select A Difficulty");
		text.setLayoutX(120);
		text.setLayoutY(300);
		text.setId("menutext");
				
		
		//Button start = new Button("Start Game");
		easy.setLayoutX(220);
		easy.setLayoutY(480);	
		
		//Button info = new Button("Info");
		medium.setLayoutX(220);
		medium.setLayoutY(550);
		
		//Button info = new Button("Info");
		hard.setLayoutX(230);
		hard.setLayoutY(620);
		
		group.getChildren().addAll(text,easy,medium,hard);
		
		//Scene sceneMenu = new Scene(group,550,800);	
		
		sceneLevel.getStylesheets().add("frogStylesheet/mainmenu_stylesheet.css");
		Image image = new Image("file:src/image/froggerUp.png");
		stage.getIcons().add(image);
		stage.setScene(sceneLevel);
		stage.setTitle("Frogger");
		
		stage.show();
	}
	
	
}
