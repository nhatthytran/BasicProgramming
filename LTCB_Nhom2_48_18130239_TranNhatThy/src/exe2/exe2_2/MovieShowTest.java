package exe2.exe2_2;

import junit.framework.TestCase;

public class MovieShowTest extends TestCase{
	
	public void testConstructor() {
		new MovieShow(5.0, 20.0, 0.50);
		new MovieShow(5.0, 20.0, 0.50);
	}
	
	/*
	 * test totalProfit
	 * ex: total = 5.0*40(customer) - 20.0 - 0.50*40(customer)=160.0
	 */
	public void testTotalProfit() {
		MovieShow ms = new MovieShow(5.0, 20.0, 0.50);
		assertEquals(ms.totalProfit(40), 160.0);
	}
}
