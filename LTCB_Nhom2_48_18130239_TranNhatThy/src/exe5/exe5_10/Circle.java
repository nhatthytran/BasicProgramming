package exe5.exe5_10;
/*
 * Circle: dinh nghia hinh tron. Gom:
 * 	toa do vi tri (loc)
 * 	ban kinh (radius)
 */
public class Circle extends ASingleShape {
	private int radius;
	
	public Circle(CartPt loc, int radius) {
		super(loc);
		this.radius = radius;
	}
	// compute the area circle
	@Override
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	
	// determine whether point inside circle
	@Override
	public boolean contains(CartPt point) {
		return this.loc.distanceTo(point) < this.radius;
	}

	// determine square bounding box of circle
	@Override
	public Square boundingBox() {
		return new Square(this.loc.findPoint(this.radius),this.radius*2);
	}
	// chu vi hinh tron
	@Override
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}

}
