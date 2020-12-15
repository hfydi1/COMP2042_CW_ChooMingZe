package frogWorld;

import java.io.File;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 * Background for the game
 *
 */
public class MyStage extends World{
	MediaPlayer mediaPlayer;
	@Override
	public void act(long now) {
		
	}
	
	public MyStage() {
		

	}
	/**
	 * play music when game is running
	 */
	public void playMusic() {
		String musicFile = "src/image/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	/**
	 * stop music
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
