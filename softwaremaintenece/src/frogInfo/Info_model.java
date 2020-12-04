package frogInfo;


import frogMain.frogScenemanager;

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
	/**
	 * construct a Info_model constructor that takes in stage as param
	 * @param primaryStage
	 */
	public Info_model(Stage stage) {		
		this.stage=stage;
		group= new Group();
		sceneinfo = new Scene(group,550,800);
		back = new Button("Back");
		this.scenemanager= new frogScenemanager(stage);
		
	}
	/**
	 * set a scene
	 * @param scene
	 */
	public void setScene(Scene scene){
        sceneinfo= scene;      
     }
	/**
	 * return the scene
	 * @return
	 */
	public Scene getScene(){
        return sceneinfo;      
     }
	/**
	 * set a stage
	 * @param stage
	 */
	public void setStage(Stage stage){
        this.stage=stage;      
     }
	/**
	 * return the stage
	 * @return
	 */
	public Stage getStage(){
		
        return stage;      
     }
	/**
	 * set a group
	 * @param group
	 */
	public void setGroup(Group group){
        this.group=group;      
     }
	/**
	 * return a group
	 * @return
	 */
	public Group getGroup(){
        return group;      
     }
	/**
	 * set a back button back to mainmenu
	 * @param back
	 */
	public void setBack(Button back){
		back.setOnAction(e->{try {
			scenemanager.startMainMenu();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		});
	}
	/**
	 * return back button 
	 * @return
	 */
	public Button getBack(){
        return back;      
     }
	
	
	
		
		
	
}
