/**
 * 
 */
package shape;

/**
 * @author nhatthy
 *
 */
public class CompositeShape implements IShape{
	private IShape top;
	private IShape bottom;
	public CompositeShape(IShape top, IShape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}
	@Override
	public double distanceToO() {
		return Math.min(this.top.distanceToO(), this.bottom.distanceToO());
	}
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		return this.top.contains(point) || this.bottom.contains(point);
	}
	@Override
	public Square boundingBox() {
		Square bTop = this.top.boundingBox();
		Square bBottom = this.bottom.boundingBox();
		int x1 = Math.min(bTop.loc.getX(), bBottom.loc.getX());
		int y1 = Math.min(bTop.loc.getY(), bBottom.loc.getY());
		int x2 = Math.max(bTop.loc.getX() + bTop.getSize(), bBottom.loc.getX()+ bBottom.getSize());
		int y2 = Math.max(bTop.loc.getY() + bTop.getSize(), bBottom.loc.getY() + bBottom.getSize());
		return new Square(new CartPt(x1, y1),
				x2 - x1);
	}
	
	

}
