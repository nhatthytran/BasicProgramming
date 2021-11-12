package exe4.exe4_4;
/*
 * Circle: dinh nghia hinh tron. Gom:
 * 	toa do vi tri (loc)
 * 	ban kinh (radius)
 */
public class Circle extends AShape {
	private int radius;
	
	public Circle(CartPt loc, int radius) {
		this.loc = loc;
		this.radius = radius;
	}
	// compute the area circle
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}
	// determine whether point inside circle
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		return this.loc.distanceTo(point) < this.radius;
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc.findPoint(this.radius),this.radius*2);
	}
	// chu vi hinh tron
	@Override
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}

}
