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
	 * @throws Exception
	 */
	public void startGame() throws Exception {
		
		Game_view view = new Game_view();
		Game_model model = new Game_model(primaryStage);
		Game_controller controller = new Game_controller(model,view);
		controller.runGame();
	}
	
	
	
}
