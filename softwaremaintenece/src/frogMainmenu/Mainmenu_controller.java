package frogMainmenu;

import frogGame.frogGame;

import javafx.scene.control.Button;
import javafx.scene.Scene;

public class Mainmenu_controller {
	
	private Mainmenu_model model;
	private Mainmenu_view view;
	
	public Mainmenu_controller(Mainmenu_model model, Mainmenu_view view){
        this.model = model;
        this.view = view;
        
     }
	
	
	public void runMainmenu()throws Exception{
		
		view.menuStart(model.getStage(), model.getGroup(), model.getScene(), model.getStart(), model.getInfo());
		model.setStart(model.getStart());
		model.setInfo(model.getInfo());
		
	}
	
	
}
