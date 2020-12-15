package frogLevel;



import frogActor.BackgroundImage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * View of the level scene
 * Where it is used to display everything
 *
 */
public class Level_view {
	public Level_view() {
		
	};
	
	/**
	 * create levelStart by getting stage, group, sceneLevel ,easy, medium and hard as params
	 * @param stage Level's stage
	 * @param group Level's group
	 * @param sceneLevel Level's scene
	 * @param easy Easy button	
	 * @param medium Medium button
	 * @param hard Hard button
	 * @throws Exception
	 */
	public void levelStart(Stage stage, Group group,Scene sceneLevel, Button easy,Button medium,Button hard) throws Exception {
		
		group.getChildren().add(new BackgroundImage("file:src/image/iKogsKW.png"));
		Text text = new Text("Please Select A Difficulty");
		text.setLayoutX(120);
		text.setLayoutY(300);
		text.setId("menutext");
				
		//Easy button
		easy.setLayoutX(220);
		easy.setLayoutY(480);	
		
		//Medium button
		medium.setLayoutX(220);
		medium.setLayoutY(550);
		
		//Hard button
		hard.setLayoutX(230);
		hard.setLayoutY(620);
		
		group.getChildren().addAll(text,easy,medium,hard);
		
		
		
		sceneLevel.getStylesheets().add("frogStylesheet/mainmenu_stylesheet.css");
		Image image = new Image("file:src/image/froggerUp.png");
		stage.getIcons().add(image);
		stage.setScene(sceneLevel);
		stage.setTitle("Frogger");
		
		stage.show();
	}
	
	
}
