package frogGame;

import frogActor.Animal;

import frogGame.Game_model;
import frogGame.Game_view;
/**
 * Controller of the game scene
 *
 */
public class Game_controller {
	
	private Game_model model;
	private Game_view view;
	/**
	 * construct a Game_controller that takes in model and view as parameters
	 * @param model Game_model class
	 * @param view  Game_view class
	 */
	public Game_controller(Game_model model, Game_view view){
        this.model = model;
        this.view = view;
        
     }
	
	
	
	/**
	 * run game scene
	 * @param s1 speed1 value from scenemanager
	 * @param s2 speed2 value from scenemanager
	 * @param s3 speed3 value from scenemanager
	 * @param s4 speed4 value from scenemanager
	 * @param s5 speed5 value from scenemanager
	 * @param s6 speed6 value from scenemanager
	 */
public void runGame(double s1,double s2, double s3, double s4 ,double s5,double s6)throws Exception{
	
		
		view.start(model.getStage(), model.getMyStage(), model.getScene(), model.getAnimal(), s1,s2, s3,s4 ,s5,s6);
		Animal.speed(s1,s2,s6);
		model.start();
		
	}
	
	
	
}
