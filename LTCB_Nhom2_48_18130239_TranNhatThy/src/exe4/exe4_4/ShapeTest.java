package exe4.exe4_4;

import junit.framework.TestCase;

public class ShapeTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Dot
		IShape dot1 = new Dot(new CartPt(2, 3));
		
		// test for Square
		IShape square1 = new Square(new CartPt(2, 3), 5);
		
		// test for Circle
		IShape circle1 = new Circle(new CartPt(2, 3), 1);
		
		// test for Rectangle
		IShape rectangle1 = new Rectangle(new CartPt(2, 2), 6, 4);
		IShape rectangle2 = new Rectangle(new CartPt(2, 2), 4, 6);
	}
	/*
	 * test for area():
	 */
	public void testArea() {
		// test for Dot => area=0
		IShape dot1 = new Dot(new CartPt(2, 3));
		assertEquals(dot1.area(), 0.0);
				
		// test for Square => area=25
		IShape square1 = new Square(new CartPt(2, 3), 5);
		assertEquals(square1.area(), 25.0, 0.001);
		
		// test for Circle => area=3.14
		IShape circle1 = new Circle(new CartPt(2, 3), 1);
		assertEquals(circle1.area(), 3.14159, 0.001);
		
		// test for Rectangle => area=24
		IShape rectangle1 = new Rectangle(new CartPt(2, 2), 6, 4);
		assertEquals(rectangle1.area(), 24.0);
	}
	/*
	 * test for distanceToO()
	 */
	public void testDistanceToO() {
		// test for Dot => distanceToO=3.6056
		IShape dot1 = new Dot(new CartPt(2, 3));
		assertEquals(dot1.distanceToO(), 3.6056, 0.001);
				
		// test for Square => distanceToO=3.6056
		IShape square1 = new Square(new CartPt(2, 3), 5);
		assertEquals(square1.distanceToO(), 3.6056, 0.001);
		
		// test for Circle => distanceToO=3.6056
		IShape circle1 = new Circle(new CartPt(2, 3), 1);
		assertEquals(circle1.distanceToO(), 3.6056, 0.001);		
		
		// test for Rectangle => distanceToO=3.6056
		IShape rectangle1 = new Rectangle(new CartPt(2, 3), 6, 4);
		assertEquals(rectangle1.distanceToO(), 3.6056, 0.001);
	}
	/*
	 * test for contains()
	 */
	public void testContains() {
		CartPt point1 = new CartPt(1, 1);
		CartPt point2 = new CartPt(4, 4);
		
		// test for Dot, point1 => true, point2 => false
		IShape dot1 = new Dot(new CartPt(1, 1));
		assertTrue(dot1.contains(point1));
		assertFalse(dot1.contains(point2));
				
		// test for Square, point1 => true, point2 => false
		IShape square1 = new Square(new CartPt(1, 1), 2);
		assertTrue(square1.contains(point1));
		assertFalse(square1.contains(point2));
				
		// test for Circle, point1 => true, point2 => false
		IShape circle1 = new Circle(new CartPt(1, 1), 1);
		assertTrue(circle1.contains(point1));
		assertFalse(circle1.contains(point2));
		
		// test for Rectangle, point1 => true, point2 => false
		IShape rectangle1 = new Rectangle(new CartPt(1, 1), 6, 4);
		assertTrue(circle1.contains(point1));
		assertFalse(circle1.contains(point2));
		
	}
	/*
	 * test for boundingBox()
	 */
	public void testBoundingBox() {
		// test for Dot 
		IShape dot1 = new Dot(new CartPt(2, 3));
		assertEquals(dot1.boundingBox(), new Square(new CartPt(2,3),0));
				
		// test for Square
		IShape square1 = new Square(new CartPt(2, 3), 5);
		assertEquals(square1.boundingBox(), new Square(new CartPt(2, 3), 5));
		
		// test for Circle
		IShape circle1 = new Circle(new CartPt(2, 2), 1);
		assertEquals(circle1.boundingBox(), new Square(new CartPt(1, 1),2));		
		
		// test for Rectangle
		IShape rectangle1 = new Rectangle(new CartPt(2, 2), 6, 4);
		IShape rectangle2 = new Rectangle(new CartPt(2, 2), 4, 6);
		assertEquals(rectangle1.boundingBox(), new Square(new CartPt(1,2),6)); // height>width
		assertEquals(rectangle2.boundingBox(), new Square(new CartPt(2,1),6)); // width>height
	}
	/*
	 * Test for perimeter()
	 */
	public void testPerimeter() {
		// test for Dot => 0
		IShape dot1 = new Dot(new CartPt(2, 3));
		assertEquals(dot1.perimeter(), 0.0);
		// test for Square => 20
		IShape square1 = new Square(new CartPt(2, 3), 5);
		assertEquals(square1.perimeter(), 5.0*4);
		// test for Circle
		IShape circle1 = new Circle(new CartPt(2, 3), 1);
		assertEquals(circle1.perimeter(), 2*Math.PI*1);
		// test for Rectangle
		IShape rectangle1 = new Rectangle(new CartPt(2, 2), 6, 4);
		assertEquals(rectangle1.perimeter(), 20.0);
	}

}
