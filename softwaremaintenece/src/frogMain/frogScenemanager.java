package frogMain;

import frogGame.Game_controller;

import frogGame.Game_model;
import frogGame.Game_view;
import frogInfo.Info_controller;
import frogInfo.Info_model;
import frogInfo.Info_view;
import frogMainmenu.Mainmenu_controller;
import frogMainmenu.Mainmenu_model;
import frogMainmenu.Mainmenu_view;
import frogLevel.Level_controller;
import frogLevel.Level_model;
import frogLevel.Level_view;
import javafx.stage.Stage;


public class frogScenemanager {
	private Stage primaryStage;
	
	/**
	 * construct a frogScenemanager that takes in primarystage as param
	 * @param primaryStage
	 */
	public frogScenemanager(Stage primaryStage) {
		
		this.primaryStage=primaryStage;
	}
	/**
	 * create startMainmenu to run mainmenu scene
	 * @throws Exception
	 */
	public void startMainMenu() throws Exception {
		
		Mainmenu_view view = new Mainmenu_view();
		Mainmenu_model model = new Mainmenu_model(primaryStage);
		Mainmenu_controller controller = new Mainmenu_controller(model,view);
		controller.runMainmenu();
	}
	/**
	 * create startInfo to run info scene
	 * @throws Exception
	 */
	public void startInfo() throws Exception {
		
		Info_view view = new Info_view();
		Info_model model = new Info_model(primaryStage);
		Info_controller controller = new Info_controller(model,view);
		controller.runInfo();
	}
	/**
	 * create startGame to run game scene
	 * @param s1 speed1 value from level_model
	 * @param s2 speed2 value from level_model
	 * @param s3 speed3 value from level_model
	 * @param s4 speed4 value from level_model
	 * @param s5 speed5 value from level_model
	 * @param s6 speed6 value from level_model
	 * @throws Exception
	 */
	public void startGame(double s1,double s2, double s3, double s4 ,double s5,double s6) throws Exception {
		
		Game_view view = new Game_view();
		Game_model model = new Game_model(primaryStage);
		Game_controller controller = new Game_controller(model,view);
		controller.runGame(s1,s2, s3,s4,s5,s6);
	}
	/**
	 * create startLevel to run level scene
	 * @throws Exception
	 */
	public void startLevel() throws Exception {
		
		Level_view view = new Level_view();
		Level_model model = new Level_model(primaryStage);
		Level_controller controller = new Level_controller(model,view);
		controller.runLevel();
	}
	
	
	
}
