package frogInfo;

import javafx.scene.Group;



import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import frogActor.BackgroundImage;
import frogMainmenu.Mainmenu_controller;
import frogMainmenu.Mainmenu_model;
import frogMainmenu.Mainmenu_view;

public class Info {
	
	//public Info() {	

	public void infoStart(Stage stage) throws Exception {
		
		Group group = new Group();
		
		Text text = new Text("RULES");
		text.setLayoutX(20);
		text.setLayoutY(60);	
		text.setId("rulestext");
		
		BackgroundImage wasd = new BackgroundImage("file:src/image/wasd.png");
		wasd.setFitWidth(100);
		wasd.setFitHeight(80);
		wasd.setLayoutX(50);
		wasd.setLayoutY(100);
		
		Text wasdtext = new Text("USE 'W' 'A' 'S' 'D' TO MOVE \nAND TRY TO REACH THE \n OTHER SIDE OF THE RIVER");
		wasdtext.setLayoutX(200);
		wasdtext.setLayoutY(130);
		wasdtext.setId("infotext");
		
		BackgroundImage car = new BackgroundImage("file:src/image/car1Left.png");
		car.setFitWidth(60);
		car.setFitHeight(40);
		car.setLayoutX(50);
		car.setLayoutY(250);
		
		BackgroundImage truck = new BackgroundImage("file:src/image/truck1Left.png");
		truck.setFitWidth(80);
		truck.setFitHeight(40);
		truck.setLayoutX(50);
		truck.setLayoutY(300);
		
		Text vehicletext = new Text("DON'T GET HIT BY VEHICLES\n ALONG THE STREET");
		vehicletext.setLayoutX(200);
		vehicletext.setLayoutY(290);
		vehicletext.setId("infotext");
		
		BackgroundImage turtle = new BackgroundImage("file:src/image/TurtleAnimation1.png");
		turtle.setFitWidth(80);
		turtle.setFitHeight(30);
		turtle.setLayoutX(50);
		turtle.setLayoutY(400);
		
		BackgroundImage log = new BackgroundImage("file:src/image/log2.png");
		log.setFitWidth(130);
		log.setFitHeight(25);
		log.setLayoutX(50);
		log.setLayoutY(450);
		
		Text rivertext = new Text("USE TURTLE SHELLS OR \nFLOATING LOGS TO CROSS \nTHE RIVER");
		rivertext.setLayoutX(240);
		rivertext.setLayoutY(420);
		rivertext.setId("infotext");
		
		BackgroundImage frogEnd = new BackgroundImage("file:src/image/FrogEnd.png");
		frogEnd.setFitWidth(100);
		frogEnd.setFitHeight(100);
		frogEnd.setLayoutX(50);
		frogEnd.setLayoutY(550);
		
		Text endtext = new Text("FILL A FROG IN EACH OF THE 5 \nCOVES TO WIN THE GAME");
		endtext.setLayoutX(220);
		endtext.setLayoutY(580);
		endtext.setId("infotext");
		
		BackgroundImage background = new BackgroundImage("file:src/image/backgroundimage.jpg");
		background.setFitWidth(550);
		background.setFitHeight(800);
		
		
		Button back = new Button("Back");		
		back.setLayoutX(250);
		back.setLayoutY(710);
		
		
		
		
		back.setOnAction(e->{
			Mainmenu_view view = new Mainmenu_view();
			Mainmenu_model model = new Mainmenu_model(stage);
			Mainmenu_controller controller = new Mainmenu_controller(model,view);
			try {
			controller.runMainmenu();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} });
		
		
		
		
		
		group.getChildren().addAll(background,car,truck,turtle,log,frogEnd,wasd);
		
		group.getChildren().addAll(text,back,wasdtext,vehicletext,rivertext,endtext);
		Scene sceneinfo = new Scene(group,550,800);
		sceneinfo.getStylesheets().add("frogStylesheet/info_stylesheet.css");
		
		stage.setScene(sceneinfo);
		stage.setTitle("info");
		stage.show();
		
		
		
	
		
	}
}
