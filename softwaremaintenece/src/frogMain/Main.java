package frogMain;







import javafx.application.Application;

import javafx.stage.Stage;
/**
 * Main to start the program
 *
 */
public class Main extends Application {
	/**
	 * main function that takes args as parameter
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	/**
	 * create start and take primaryStage as parameter
	 * the program start with mainmenu
	 */
	public void start (Stage primaryStage) throws Exception{
		
		frogScenemanager scenemanager = new frogScenemanager(primaryStage);
		scenemanager.startMainMenu();
	}
	
	
	
}