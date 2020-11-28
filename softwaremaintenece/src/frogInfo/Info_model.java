package frogInfo;

import frogGame.frogGame;
import frogMainmenu.Mainmenu_controller;
import frogMainmenu.Mainmenu_model;
import frogMainmenu.Mainmenu_view;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Info_model {
	
	private Scene sceneinfo;
	private Stage stage;
	private Group group;
	private Button back;
	
	public Info_model(Stage stage) {		
		this.stage=stage;
		group= new Group();
		sceneinfo = new Scene(group,550,800);
		back = new Button("Back");
		
	}
	
	public void setScene(Scene scene){
        sceneinfo= scene;      
     }
	
	public Scene getScene(){
        return sceneinfo;      
     }
	
	public void setStage(Stage stage){
        this.stage=stage;      
     }
	
	public Stage getStage(){
		
        return stage;      
     }
	
	public void setGroup(Group group){
        this.group=group;      
     }
	
	public Group getGroup(){
        return group;      
     }
	
	public void setBack(Button back){
		back.setOnAction(e->{
			Mainmenu_view view = new Mainmenu_view();
			Mainmenu_model model = new Mainmenu_model(stage);
			Mainmenu_controller controller = new Mainmenu_controller(model,view);
			try {
			controller.runMainmenu();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} });
	}
	
	public Button getBack(){
        return back;      
     }
	
	
	
		
		
	
}
