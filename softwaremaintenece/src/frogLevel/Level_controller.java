package frogLevel;

import frogLevel.Level_model;
import frogLevel.Level_view;

public class Level_controller {
	
	private Level_model model;
	private Level_view view;
	/**
	 * construct a Mainmenu_controller that takes in model and view as parameters
	 * @param model
	 * @param view
	 */
	public Level_controller(Level_model model, Level_view view){
        this.model = model;
        this.view = view;
        
     }
	
	/**
	 * run Mainmenu scene
	 * @throws Exception
	 */
	public void runLevel()throws Exception{
		
		view.levelStart(model.getStage(), model.getGroup(), model.getScene(), model.getEasy(), model.getMedium(),model.getHard());
		model.setEasy(model.getEasy());
		model.setMedium(model.getMedium());
		model.setHard(model.getHard());
		
	}
	
	
}
