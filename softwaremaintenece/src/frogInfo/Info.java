package frogInfo;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import frogActor.BackgroundImage;
import frogMainmenu.Mainmenu;

public class Info {
	
	//public Info() {	

	public void infoStart(Stage stage) throws Exception {
		
		Group group = new Group();
		
		Text text = new Text("Game Info");
		text.setLayoutX(240);
		text.setLayoutY(200);			
		
		
		
		
		Button back = new Button("back");		
		back.setLayoutX(250);
		back.setLayoutY(710);
		
		
		
		
		back.setOnAction(e->{Mainmenu mainmenu = new Mainmenu(); try {
			mainmenu.menuStart(stage);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} });
		
		
		
		
		
		group.getChildren().addAll(new BackgroundImage("file:src/image/iKogsKW.png"));
		
		group.getChildren().addAll(text,back);
		Scene sceneinfo = new Scene(group,550,800);
		
		
		stage.setScene(sceneinfo);
		stage.setTitle("info");
		stage.show();
		
		
		
	
		
	}
}
