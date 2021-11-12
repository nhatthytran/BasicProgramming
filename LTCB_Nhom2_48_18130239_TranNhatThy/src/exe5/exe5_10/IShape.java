package exe5.exe5_10;
/*
 * IShape, which means that it is a placeholder for some unknown (Dot, Square, Circle) shape.
 */
public interface IShape {
	
	/**
	 * 
	 * @return how close a combination of shapes is to the origin
	 */
	public double distanceToO();
	
	/**
	 * 
	 * @param point
	 * @return some point in the Cartesian space falls within the boundaries of some shape.
	 */
	public boolean contains(CartPt point);
	/**
	 * 
	 * @return the bounding box for a shape.
	 */
	public Square boundingBox();

}
