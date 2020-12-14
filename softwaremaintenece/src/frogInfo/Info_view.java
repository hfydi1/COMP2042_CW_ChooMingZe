package frogInfo;

import frogActor.BackgroundImage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Info_view {
	
	public Info_view() {		
	}
	/**
	 * create infoStart by getting stage, group, sceneinfo , back as params
	 * @param stage
	 * @param group
	 * @param sceneinfo
	 * @param back
	 * @throws Exception
	 */
	public void infoStart(Stage stage, Group group,Scene sceneinfo, Button back) throws Exception {
		
	
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
	
	//background
	BackgroundImage background = new BackgroundImage("file:src/image/backgroundimage.jpg");
	background.setFitWidth(550);
	background.setFitHeight(800);
	
	//back button	
	back.setLayoutX(250);
	back.setLayoutY(710);
	
	group.getChildren().addAll(background,car,truck,turtle,log,frogEnd,wasd,text,back,wasdtext,vehicletext,rivertext,endtext);
	sceneinfo.getStylesheets().add("frogStylesheet/info_stylesheet.css");
	
	Image image = new Image("file:src/image/froggerUp.png");
	stage.getIcons().add(image);
	
	stage.setScene(sceneinfo);
	stage.setTitle("Info");
	stage.show();
	}

}
