package frogMainmenu;

import frogActor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Mainmenu_view {
	public Mainmenu_view() {
		
	};
	/**
	 * create menuStart by getting stage, group, sceneMenu,start and info as params
	 * @param stage
	 * @param group
	 * @param sceneMenu
	 * @param start
	 * @param info
	 * @throws Exception
	 */
	public void menuStart(Stage stage, Group group,Scene sceneMenu, Button start,Button info) throws Exception {
		
		//Group group = new Group();
		group.getChildren().add(new BackgroundImage("file:src/image/iKogsKW.png"));
		
		Text text = new Text("Welcome to Frogger");
		text.setLayoutX(170);
		text.setLayoutY(300);
		text.setId("menutext");
				
		
		//Button start = new Button("Start Game");
		start.setLayoutX(230);
		start.setLayoutY(500);	
		
		//Button info = new Button("Info");
		info.setLayoutX(245);
		info.setLayoutY(550);
		
		group.getChildren().addAll(text,start,info);
		
		//Scene sceneMenu = new Scene(group,550,800);	
		sceneMenu.getStylesheets().add("frogStylesheet/mainmenu_stylesheet.css");
		stage.setScene(sceneMenu);
		stage.setTitle("Frogger");
		stage.show();
	}
	
	
}
