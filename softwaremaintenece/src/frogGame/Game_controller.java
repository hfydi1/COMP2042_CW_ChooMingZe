package frogGame;

import frogGame.Game_model;
import frogGame.Game_view;

public class Game_controller {
	
	private Game_model model;
	private Game_view view;
	/**
	 * construct a Game_controller that takes in model and view as parameters
	 * @param model
	 * @param view
	 */
	public Game_controller(Game_model model, Game_view view){
        this.model = model;
        this.view = view;
        
     }
	/**
	 * run game scene
	 * @throws Exception
	 */
public void runGame()throws Exception{
		
		view.start(model.getStage(), model.getMyStage(), model.getScene(), model.getAnimal());
		//model.getMyStage().start();
		//model.getMyStage().start();
		model.start();
		
	}
	
	
	
}
