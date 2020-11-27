package frogMainmenu;

import javafx.scene.Scene;

import javafx.scene.control.Button;
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
		start.setOnAction(e-> {frogGame froggame = new frogGame(); try {
			froggame.start(stage);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} });     
     }
	
	
	
	public void setInfo(Button info){
		info.setOnAction(e->{Info gameinfo = new Info(); try {
			gameinfo.infoStart(stage);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} });   
     }
	
	public Button getInfo(){
        return info;      
     
	}
	
	
	
	

}
