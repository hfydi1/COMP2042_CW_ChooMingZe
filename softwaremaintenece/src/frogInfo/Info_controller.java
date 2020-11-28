package frogInfo;



public class Info_controller {
	
	private Info_model model;
	private Info_view view;
	
	public Info_controller(Info_model model, Info_view view){
        this.model = model;
        this.view = view;      
        
     }
	
	public void runInfo() throws Exception{
		
		view.infoStart(model.getStage(), model.getGroup(), model.getScene(), model.getBack());
		model.setBack(model.getBack());
	}
}
	
	
	