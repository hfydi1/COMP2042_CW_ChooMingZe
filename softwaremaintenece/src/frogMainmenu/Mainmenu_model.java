package frogMainmenu;

import javafx.scene.Scene;
import frogMain.frogScenemanager;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.stage.Stage;


public class Mainmenu_model {
	private Scene sceneMenu;
	private Stage stage;
	private Group group;
	private Button start;
	private Button info;
	private frogScenemanager scenemanager;
	/**
	 * construct a Mainmenu_model constructor that takes in stage as param
	 * @param primaryStage
	 */
	public Mainmenu_model(Stage stage) {		
		this.stage=stage;
		group= new Group();
		sceneMenu= new Scene(group,550,800);
		start = new Button("Start Game");
		info = new Button("Info");
		scenemanager = new frogScenemanager(stage);
	}
	/**
	 * set a scene
	 * @param scene
	 */
	public void setScene(Scene scene){
        sceneMenu= scene;      
     }
	/**
	 * return a scene
	 * @return
	 */
	public Scene getScene(){
        return sceneMenu;      
     }
	/**
	 * set a stage
	 * @param stage
	 */
	public void setStage(Stage stage){
        this.stage=stage;      
     }
	/**
	 * return astage
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
	 * return start button
	 * @return
	 */
	public Button getStart(){
        return start;      
     }
	/**
	 * set a start button to game scene
	 * @param start
	 */
	public void setStart(Button start){
		start.setOnAction(e-> {	try {
			scenemanager.startGame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}			
     });
	}	
	/**
	 * set a info button to info scene
	 * @param info
	 */
	public void setInfo(Button info){
		info.setOnAction(e->{try {
			scenemanager.startInfo();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     });
	}
	/**
	 * return info button
	 * @return
	 */
	public Button getInfo(){
        return info;      
     
	}
	
	
	
	

}
