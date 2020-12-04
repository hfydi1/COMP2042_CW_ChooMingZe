package frogInfo;

import frogGame.frogGame;
import frogMain.frogScenemanager;
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
	private frogScenemanager scenemanager;
	
	public Info_model(Stage stage) {		
		this.stage=stage;
		group= new Group();
		sceneinfo = new Scene(group,550,800);
		back = new Button("Back");
		this.scenemanager= new frogScenemanager(stage);
		
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
		back.setOnAction(e->{try {
			scenemanager.startMainMenu();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		});
	}
	
	public Button getBack(){
        return back;      
     }
	
	
	
		
		
	
}
