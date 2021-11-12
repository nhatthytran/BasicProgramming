package exe4.exe4_4;
/*
 * Rectangle: dinh nghia hinh chu nhat. Gom:
 * 	- chieu dai: height
 * 	- chieu rong: width
 */
public class Rectangle extends AShape{
	private int height;
	private int width;
	
	public Rectangle(CartPt loc, int height, int width) {
		this.loc = loc;
		this.height = height;
		this.width = width;
	}

	// compute area rectangle
	@Override
	public double area() {
		return this.height*this.width;
	}

	// determine whether point is inside rectangle
	@Override
	public boolean contains(CartPt point) {
		return this.loc.insideSquare(point, this.width, this.height);
	}

	// bounding
	@Override
	public Square boundingBox() {
		if(this.width>this.height) {
			return new Square(this.loc.findPointRec(this.width, this.height),this.width);
		} else 
			return new Square(this.loc.findPointRec(this.width, this.height), this.height);
	}
	// chu vi
	@Override
	public double perimeter() {
		return (this.height+this.width)*2;
	}

}
