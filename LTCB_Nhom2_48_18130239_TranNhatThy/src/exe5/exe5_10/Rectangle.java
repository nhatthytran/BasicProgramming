/**
 * 
 */
package exe5.exe5_10;

/**
 * @author thynt
 *
 */
public class Rectangle extends ASingleShape {

	/**
	 * @param loc:   vi tri goc trai tren
	 * @param height
	 * @param width
	 */
	private int height;
	private int width;

	public Rectangle(CartPt loc, int height, int width) {
		super(loc);
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return this.height * this.width;
	}

	@Override
	public boolean contains(CartPt point) {
		int x = this.loc.getX();
		int y = this.loc.getY();
		return x < point.getX() && point.getX() < x + this.width && y < point.getY() && point.getY() < y + this.height;
	}

	@Override
	public Square boundingBox() {
		if(this.height < this.width) {
			return new Square(new CartPt(this.loc.getX(), this.loc.getY()-(this.width-this.height)/2), this.width);
		} else{
			if(this.height > this.width) {
				return new Square(new CartPt(this.loc.getX()-(this.height-this.width)/2, this.loc.getY()), this.height);
			} else
				return new Square(this.loc, this.height);
		}
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
