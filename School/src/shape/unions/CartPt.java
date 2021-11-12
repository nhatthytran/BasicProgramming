package shape.unions;

/*
 * CartPt: dinh nghia toa do vi tri (x,y). Gom:
 * 	toa do x (x)
 * 	toa do y (y)
 */
public class CartPt {
	private int x;
	private int y;

	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// getter and setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/*
	 * compute the distance to the origin
	 */
	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	/*
	 * determine whether x < pointX < x+delta
	 */
	public boolean insideSquare(CartPt point, int deltaX, int deltaY) {
		return point.getX() >= this.x && point.getX() <= this.x + deltaX && point.getY() >= this.y
				&& point.getY() <= this.y + deltaY;
	}

	/*
	 * compute distance from this point to that point
	 */
	public double distanceTo(CartPt point) {
		return Math.sqrt(
				(this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY()));
	}

	// tim diem cua hinh vuong bao quanh hinh tron
	public CartPt findPoint(int radius) {
		return new CartPt(this.x - radius, this.y - radius);
	}

	// tim diem cua hinh vuong bao quanh hcn
	public CartPt findPointRec(int width, int height) {
		if (width > height) {
			return new CartPt(this.x, this.y - (width-height) / 2);
		} else
			return new CartPt(this.x - (height-width) / 2, this.y);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof CartPt)) {
			return false;
		} else {
			CartPt that = (CartPt) obj;
			return this.x == that.x && this.y == that.y;
		}
		
	}

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	

}
