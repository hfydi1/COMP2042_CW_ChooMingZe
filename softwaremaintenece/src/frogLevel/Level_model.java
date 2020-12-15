package frogLevel;

import javafx.scene.Scene;


import frogMain.frogScenemanager;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.stage.Stage;


public class Level_model {
	private Scene sceneLevel;
	private Stage stage;
	private Group group;
	private Button easy;
	private Button medium;
	private Button hard;
	private frogScenemanager scenemanager;
	/**
	 * construct a Level_model constructor that takes in stage as param
	 * @param stage
	 */
	public Level_model(Stage stage) {		
		this.stage=stage;
		group= new Group();
		sceneLevel =new Scene(group,550,800);
		easy = new Button("Beginner");
		medium = new Button("Medium");
		hard = new Button("Hard");
		scenemanager = new frogScenemanager(stage);
	}
	/**
	 * set a scene
	 * @param scene
	 */
	public void setScene(Scene scene){
        sceneLevel= scene;      
     }
	/**
	 * return a scene
	 * @return
	 */
	public Scene getScene(){
        return sceneLevel;      
     }
	/**
	 * set a stage
	 * @param stage
	 */
	public void setStage(Stage stage){
        this.stage=stage;      
     }
	/**
	 * return a stage
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
	 * return easy button
	 * @return
	 */
	public Button getEasy(){
        return easy;      
     }
	
	/**
	 * set an easy button to game scene
	 * @param easy
	 */
	public void setEasy(Button easy){
		easy.setOnAction(e-> {	try {
			scenemanager.startGame(0.75,-1,-2,-5,1,-3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}			
     });
	}	
	/**
	 * set a medium button to game scene
	 * @param info
	 */
	public void setMedium(Button medium){
		medium.setOnAction(e->{try {
			scenemanager.startGame(1.0,-1.25,-2.25,-5.0,1.25,-3.5);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     });
	}
	
	/**
	 * return medium button
	 * @return
	 */
	public Button getMedium(){
        return medium;      
     
	}
	
	/**
	 * set a hard button to game scene
	 * @param hard
	 */
	
	public void setHard(Button hard){
		hard.setOnAction(e->{try {
			scenemanager.startGame(2,-2.0,-3.5,-5.2,2.5,-4);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     });
	}
	
	/**
	 * return hard button
	 * @return
	 */
	public Button getHard(){
        return hard;      
     
	}
	
	
	
	

}
