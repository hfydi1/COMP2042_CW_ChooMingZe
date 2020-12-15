package frogMainmenu;

/**
 * Controller of the mainmenu scene
 *
 */
public class Mainmenu_controller {
	
	private Mainmenu_model model;
	private Mainmenu_view view;
	/**
	 * construct a Mainmenu_controller that takes in model and view as parameters
	 * @param model Mainmenu_model
	 * @param view Mainmenu_view
	 */
	public Mainmenu_controller(Mainmenu_model model, Mainmenu_view view){
        this.model = model;
        this.view = view;
        
     }
	
	/**
	 * run Mainmenu scene
	 * @throws Exception
	 */
	public void runMainmenu()throws Exception{
		
		view.menuStart(model.getStage(), model.getGroup(), model.getScene(), model.getStart(), model.getInfo());
		model.setStart(model.getStart());
		model.setInfo(model.getInfo());
		
	}
	
	
}
