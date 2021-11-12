package exe4.exe4_4;
/*
 * Square: dinh nghia hinh vuong. Gom:
 * 	toa do vi tri (loc)
 * 	kich thuoc (size)
 */
public class Square extends AShape {
	private int size;
	
	public Square(CartPt loc, int size) {
		super();
		this.loc = loc;
		this.size = size;
	}
	// compute area of square = size*size
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.size * this.size;
	}
	// determine whether point inside square
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		return this.loc.insideSquare(point,this.size, this.size);
	}
	// hinh vuong bao quanh hinh vuong la chinh no
	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc, this.size);
	}
	public boolean equals(Object o) {
		if(o == null || !(o instanceof Square))
			return false;
		else {
			Square that = (Square) o;
			return this.loc.getX() == that.getLoc().getX()
					&& this.loc.getY() == that.getLoc().getY();
		}
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	// chu vi
	@Override
	public double perimeter() {
		return this.size*4;
	}
	

}
