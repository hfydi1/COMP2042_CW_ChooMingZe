package frogInfo;


/**
 * Controller of the info scene
 *
 */
public class Info_controller {
	
	private Info_model model;
	private Info_view view;
	/**
	 * construct a Info_controller that takes in model and view as parameters
	 * @param model Info_model
	 * @param view Info_view
	 */
	public Info_controller(Info_model model, Info_view view){
        this.model = model;
        this.view = view;      
        
     }
	/**
	 * run info scene
	 */
	public void runInfo() throws Exception{
		
		view.infoStart(model.getStage(), model.getGroup(), model.getScene(), model.getBack());
		model.setBack(model.getBack());
	}
}
	
	
	