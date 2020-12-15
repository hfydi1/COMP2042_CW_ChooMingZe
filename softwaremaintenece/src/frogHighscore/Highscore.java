package frogHighscore;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Highscore{

	public void highcore(){
	}
	
	public ArrayList<Integer> scorearr = new ArrayList<Integer>();
	File scorefile = new File ("src/frogHighscore/hscore.txt");	
	/**
	 * create a set score to get the score from the game and set in a txt file
	 * @param point getting score from game
	 * @throws IOException
	 */
	public void setScore(int point) throws IOException{		
		
		if (scorefile.exists()==false) {
			scorefile.createNewFile();
			
		}
			
		for(int i=0;i<10;i++) {
			
			scorearr.add(0);
		}
		if(point>800) {
			point=800;
		}
		if(point<0) {
			point=0;
		}
	Scanner scanner = new Scanner(scorefile);
		
		try {
			
			while(scanner.hasNextLine()) {
				String scorestr =scanner.nextLine();
				scorearr.add(Integer.parseInt (scorestr));				
			}
				
			} catch(Exception e) {				
				e.printStackTrace();
			}
			scanner.close();			
			if (scorearr.size()>10) {
				if(point>=scorearr.get(9)) { 
						scorearr.add(point);
						
				}			
				
			}else {				
				scorearr.add(point);			
			}
			
			Collections.sort(scorearr,Collections.reverseOrder());	
			FileWriter file = new FileWriter(scorefile);
			BufferedWriter buffer = new BufferedWriter(file);
			PrintWriter writer = new PrintWriter(buffer);{
		
			
			for(int i=0;i<10;i++) {
				writer.println(scorearr.get(i));
				
			}
			writer.close();
			
			
	}
}
	/**
	 * create a display to show the highscore
	 * @param array array that contains all the scores
	 * @return display the score
	 */
	public String display(ArrayList<Integer> array) {
		
			String sortedscore = new String("Highscore\n1." + array.get(0)+ "\n2." +array.get(1)+ "\n3." +array.get(2)+ "\n4." +array.get(3) +"\n5." +array.get(4)+ "\n6." +array.get(5) +"\n7." +array.get(6)+ "\n8." +array.get(7) +"\n9." +array.get(8)+ "\n10." +array.get(9));
			return sortedscore;
			//System.out.println(scorearr.get(i));
	
	
}

	/**
	 * get previous high score to be displayed
	 */
	public void getScore() {
		
		try {
				Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setTitle("You Have Won The Game!");
			
        		alert.setHeaderText(display(scorearr));
			
        		alert.setContentText("Highest Possible Score: 800");
        		alert.show();				
			} catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
	
}

	


	
	
	
	


