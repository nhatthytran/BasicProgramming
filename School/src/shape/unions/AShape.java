/**
 * 
 */
package shape.unions;

/**
 * @author thytn
 *
 */
public abstract class AShape implements IShape {
	protected CartPt loc;

	public AShape(CartPt loc) {
		super();
		this.loc = loc;
	}
	
	public abstract double area();
	@Override
	public double distanceToO() {
		return this.loc.distanceToO();
	}

	public abstract boolean contains(CartPt point);
	public abstract Square boundingBox();
	public abstract double perimeter();
}
