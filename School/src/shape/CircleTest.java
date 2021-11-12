package shape;

import junit.framework.TestCase;

public class CircleTest extends TestCase{

	// test constructor
	public void testConstructor() {
		new Circle(new CartPt(3, 4), 5);
		new Circle(new CartPt(5, 12), 10);
		new Circle(new CartPt(6, 8), 20);
	}
	
	/*
	 * test distanceToO
	 * ex: new Circle(new CartPt(3, 4), 5);
	 * new Circle(new CartPt(5, 12), 10);
	 * new Circle(new CartPt(6, 8), 20);
	 */
	public void testDistanceToO() {
		Circle c1 = new Circle(new CartPt(3, 4), 5);
		Circle c2 = new Circle(new CartPt(5, 12), 10);
		Circle c3 = new Circle(new CartPt(6, 8), 20);
		assertEquals(c1.distanceToO(), 5.0, 0.001);
		assertEquals(c2.distanceToO(), 13.0, 0.001);
	}
	/*
	 * test volume()
	 * vd: new Cylinder(new Circle(new CartPt(3,4),5),10) => volume=
	 */
	
	
}
