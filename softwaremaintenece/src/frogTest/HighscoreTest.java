package frogTest;



import static org.junit.jupiter.api.Assertions.*;




import java.io.IOException;
import org.junit.jupiter.api.Test;

import frogHighscore.Highscore;



class HighscoreTest {
	/**
	 * Test maximum score of highscore
	 * @throws IOException
	 */
	@Test
	public void testHighscore() throws IOException {
		Highscore test = new Highscore();
		test.setScore(810);
		assertEquals(test.scorearr.get(0),800);
	}
	/**
	 * Test present of negative value in highscorelist
	 * @throws IOException
	 */
	@Test
	public void testNegative() throws IOException {
		Highscore test2 = new Highscore();
		test2.setScore(-10);
		
		for(int i=1;i<10;i++) {
			
			assertNotSame(test2.scorearr.get(i),-10);
		}
	}
	/**
	 * Test array null
	 * @throws IOException
	 */
	@Test
	public void testNull() throws IOException {
		Highscore test3 = new Highscore();
		test3.setScore(0);
			
			assertNotNull(test3.scorearr.get(0));
		
	}
	
	/**
	 * Test sorting in array
	 * @throws IOException
	 */
	@Test
	public void testSort() throws IOException {
		Highscore test4 = new Highscore();
		test4.setScore(10);
		test4.setScore(1);
		assertTrue(test4.scorearr.get(0)>=test4.scorearr.get(1));
	}
	
	
	
}
