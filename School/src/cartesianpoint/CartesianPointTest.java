package cartesianpoint;

import junit.framework.TestCase;

public class CartesianPointTest extends TestCase{

	public void testDistanceToO() {
		// 0.001 la so lam tron
		assertEquals(new CartesianPoint(5, 12).distanceToO(), 13.0, 0.001);
	}
	
	public void testDistanceTo() {
		assertEquals(new CartesianPoint(6, 8).distanceTo(new CartesianPoint(3, 4)),5.0, .001);
	}
}
