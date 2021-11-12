/**
 * 
 */
package shape;

/**
 * @author thytn
 *
 */
public abstract class ASingleShape implements IShape{
	protected CartPt loc;

	/**
	 * 
	 * @param loc
	 */
	public ASingleShape(CartPt loc) {
		super();
		this.loc = loc;
	}
	
	public abstract double area();
	
	public double distanceToO() {
		return this.loc.distanceToO();
	}

	public abstract boolean contains(CartPt point);
	public abstract Square boundingBox();
	public abstract double perimeter();
}
