package frogMainmenu;



import frogActor.BackgroundImage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Mainmenu_view {
	public Mainmenu_view() {
		
	};
	/**
	 * create menuStart by getting stage, group, sceneMenu,start and info as params
	 * @param stage Menu's stage
	 * @param group Menu's group
	 * @param sceneMenu Menu's scene
	 * @param start Start button
	 * @param info Info button
	 * @throws Exception
	 */
	public void menuStart(Stage stage, Group group,Scene sceneMenu, Button start,Button info) throws Exception {
		
		group.getChildren().add(new BackgroundImage("file:src/image/iKogsKW.png"));
		Text text = new Text("Welcome to Frogger");
		text.setLayoutX(170);
		text.setLayoutY(300);
		text.setId("menutext");
				
		//Start button
		start.setLayoutX(230);
		start.setLayoutY(500);	
		
		//Info button
		info.setLayoutX(245);
		info.setLayoutY(550);
		
		group.getChildren().addAll(text,start,info);
		
		
		sceneMenu.getStylesheets().add("frogStylesheet/mainmenu_stylesheet.css");
		Image image = new Image("file:src/image/froggerUp.png");
		stage.getIcons().add(image);
		stage.setScene(sceneMenu);
		stage.setTitle("Frogger");
		
		stage.show();
	}
	
	
}
