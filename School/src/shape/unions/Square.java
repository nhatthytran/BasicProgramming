package shape.unions;
/*
 * Square: dinh nghia hinh vuong. Gom:
 * 	toa do vi tri (loc)
 * 	kich thuoc (size)
 */
public class Square extends AShape {
	private int size;
	
	public Square(CartPt loc, int size) {
		super(loc);
		this.size = size;
	}
	// 1. compute area of square = size*size
	@Override
	public double area() {
		return this.size * this.size;
	}
	
	// 2. determine whether point inside square
	@Override
	public boolean contains(CartPt point) {
		return this.loc.insideSquare(point,this.size, this.size);
	}
	
	// 3. determine square bounding box of square
	@Override
	public Square boundingBox() {
		return new Square(this.loc, this.size);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Square)) {
			return false;
		} else {
			Square other = (Square) obj;
			return this.loc.equals(other)
					&& this.size == other.size;
		}
	}

	// chu vi
	@Override
	public double perimeter() {
		return this.size*4;
	}
	

}
