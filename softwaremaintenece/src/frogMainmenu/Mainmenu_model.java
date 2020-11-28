package frogMainmenu;

import javafx.scene.Scene;

import frogInfo.Info_view;
import frogInfo.Info_controller;
import frogInfo.Info_model;
import javafx.scene.control.Button;
import frogGame.Game_controller;
import frogGame.Game_model;
import frogGame.Game_view;
import frogGame.frogGame;
import frogInfo.Info;
import javafx.scene.Group;
import javafx.stage.Stage;


public class Mainmenu_model {
	private Scene sceneMenu;
	private Stage stage;
	private Group group;
	private Button start;
	private Button info;
	
	public Mainmenu_model(Stage stage) {		
		this.stage=stage;
		group= new Group();
		sceneMenu= new Scene(group,550,800);
		start = new Button("Start Game");
		info = new Button("Info");
		
	}
	public void setScene(Scene scene){
        sceneMenu= scene;      
     }
	
	public Scene getScene(){
        return sceneMenu;      
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
	
	public Button getStart(){
        return start;      
     }
	
	public void setStart(Button start){
		start.setOnAction(e-> {
			
			Game_view view = new Game_view();
			Game_model model = new Game_model(stage);
			Game_controller controller = new Game_controller(model,view);		
		try {
			controller.runGame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} });     
     }
	
	
	
	public void setInfo(Button info){
		info.setOnAction(e->{
			Info_view view = new Info_view();
			Info_model model = new Info_model(stage);
			Info_controller controller = new Info_controller(model,view);
			try {
			controller.runInfo();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} });   
     }
	
	public Button getInfo(){
        return info;      
     
	}
	
	
	
	

}
