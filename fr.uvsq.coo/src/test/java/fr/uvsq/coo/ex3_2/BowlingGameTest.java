package fr.uvsq.coo.ex3_2;



import static org.junit.Assert.*;

import org.junit.*;


public class BowlingGameTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	private Game g;
	
	@Before
	public void setUp() throws Exception {
		g = new Game();
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++)
		g.roll(pins);
		}
	
	@Test
	public void testGutterGame() throws Exception {
		for (int i = 0; i < 20; i++)
		g.roll(0);
		assertEquals(0, g.score());
	}
	
	@Test
	public void testAllOnes() throws Exception {
		for (int i = 0; i < 20; i++)
		g.roll(1);
		assertEquals(20, g.score());
	}
	
	@Test
	public void testOneSpare() throws Exception {
		rollSpare();
		g.roll(3);
		rollMany(17,0);
		assertEquals(16,g.score());
	}
	
	@Test
	public void testOneStrike() throws Exception {
		rollStrike();
		g.roll(3);
		g.roll(4);
		rollMany(16, 0);
		assertEquals(24, g.score());
	}
	
	@Test
	public void testPerfectGame() throws Exception {
		rollMany(12,10);
		assertEquals(300, g.score());
		}
	
	private void rollStrike() {
		g.roll(10);
		}
	
	private void rollSpare() {
		g.roll(5);
		g.roll(5);
		}

}
