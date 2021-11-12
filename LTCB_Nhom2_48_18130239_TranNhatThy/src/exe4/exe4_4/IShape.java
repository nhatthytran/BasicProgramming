package exe4.exe4_4;
/*
 * IShape, which means that it is a placeholder for some unknown (Dot, Square, Circle) shape.
 */
public interface IShape {

	// 1. compute the area of a shape
	public double area();
	// 2. compute the distance of a shape to the origin O(0,0)
	public double distanceToO();
	// 3. determine whether some point is inside the shape
	public boolean contains(CartPt point);
	// 4. compute the bounding box of a shape
	public Square boundingBox();
	// 5. compute perimeter
	public double perimeter();
}
