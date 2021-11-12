package exe5.exe5_10;

import junit.framework.TestCase;

public class ShapeTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Dot
		ASingleShape dot1 = new Dot(new CartPt(2, 3));
		
		// test for Square
		ASingleShape square1 = new Square(new CartPt(2, 3), 5);
		
		// test for Circle
		ASingleShape circle1 = new Circle(new CartPt(2, 3), 1);
		
		// test for Rectangle
		ASingleShape rectangle1 = new Rectangle(new CartPt(2, 2), 6, 4);
		ASingleShape rectangle2 = new Rectangle(new CartPt(2, 2), 4, 6);
	}
	
	/*
	 * test for distanceToO of CompositeShape
	 */
	public void testDistanceToO() {
		ASingleShape square = new Square(new CartPt(1,1), 3);
		ASingleShape circle = new Circle(new CartPt(2, 2), 2);
		
		IShape composite = new CompositeShape(square, circle);
		
		assertEquals(composite.distanceToO(), Math.sqrt(1+1));
	}
	/*
	 * test for contains of CompositeShape
	 */
	public void testContains() {
		ASingleShape square = new Square(new CartPt(1,1), 3);
		ASingleShape circle = new Circle(new CartPt(2, 2), 2);
		
		IShape composite = new CompositeShape(square, circle);
		
		assertTrue(composite.contains(new CartPt(2,2)));
		assertFalse(composite.contains(new CartPt(5,6)));
	}
	/*
	 * test for boundingBox of CompositeShape
	 */
	public void testBoundingBox() {
		ASingleShape square = new Square(new CartPt(1,1), 3);
		ASingleShape circle = new Circle(new CartPt(2, 2), 2);
		
		IShape composite = new CompositeShape(square, circle);
		
		assertEquals(composite.boundingBox(), new Square(new CartPt(0, 0), 4));
		
	}
}
