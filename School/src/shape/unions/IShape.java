package shape.unions;
/*
 * IShape, which means that it is a placeholder for some unknown (Dot, Square, Circle) shape.
 */
public interface IShape {
	/* 
	 * 1. compute the area of a shape
	 * - input: hinh(IShape)
	 * - output: double
	 */
	public double area();
	/*
	 * 2. compute the distance of a shape to the origin O(0,0)
	 * - input: hinh (IShape)
	 * - output: double	 
	 * */
	public double distanceToO();
	/*
	 * 3. determine whether some point is inside the shape
	 * - input: hinh (IShape), CartPt
	 * - output: boolean
	 */
	public boolean contains(CartPt point);
	/*
	 *  4. compute the bounding box of a shape
	 *  - input: hinh (IShape)
	 *  - output: Square
	 */
	public Square boundingBox();
	/*
	 *  5. compute perimeter
	 *  - input: hinh (IShape)
	 *  - output: double
	 */
	public double perimeter();
}
