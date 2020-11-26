package frogMainmenu;

import javafx.application.Application;



import p4_group_8_repo.Main;
import p4_group_8_repo.frogGame;
import frogActor.BackgroundImage;
import frogInfo.Info;
import javafx.css.*;
import java.util.List;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Mainmenu  {
	
	public Mainmenu() {	}


	public void menuStart(Stage stage) throws Exception {
		
		Group group = new Group();
		
		//set background image
		group.getChildren().add(new BackgroundImage("file:src/image/iKogsKW.png"));
		
		//text 
		Text text = new Text("Welcome to Frogger");
		//group.getChildren().add(text);
		text.setLayoutX(200);
		text.setLayoutY(300);
		text.setId("menutext");
		
		//start button
		Button start = new Button("Start Game");
		//group.getChildren().add(start);
		start.setLayoutX(230);
		start.setLayoutY(500);		
		
		//start button action
		start.setOnAction(e->{frogGame froggame = new frogGame(); try {
			froggame.start(stage);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} });
		
		//info button
		Button info = new Button("Info");
		//group.getChildren().add(info);
		info.setLayoutX(245);
		info.setLayoutY(550);
		
		//info button action
		info.setOnAction(e->{Info ifo = new Info(); try {
			ifo.infoStart(stage);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} });
		
		group.getChildren().addAll(text,start,info);
		
		
		//set scene
		Scene sceneMenu = new Scene(group,550,800);	
		sceneMenu.getStylesheets().add("frogStylesheet/mainmenu_stylesheet.css");
		stage.setScene(sceneMenu);
		stage.setTitle("Frogger");
		stage.show();
	}
	
			
}