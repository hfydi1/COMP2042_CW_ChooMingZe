package frogHighscore;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;



class HighscoreTest {
	
	@Test
	public void testHighscore() throws IOException {
		Highscore test = new Highscore();
		test.setScore(810);
		assertEquals(test.scorearr.get(0),800);
	}

	@Test
	public void testNegative() throws IOException {
		Highscore test2 = new Highscore();
		test2.setScore(-10);
		
		for(int i=1;i<10;i++) {
			
			assertNotSame(test2.scorearr.get(i),-10);
		}
	}
}
