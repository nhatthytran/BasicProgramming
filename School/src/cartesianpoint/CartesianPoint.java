package cartesianpoint;

public class CartesianPoint {
	int x;
	int y;
	public CartesianPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// to compute distance from point to O(0;0)
	public double distanceToO() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	// to compute distance to between 2 point
	public double distanceTo(CartesianPoint point) {
		return Math.sqrt((this.x - point.x)*(this.x - point.x)
						+ (this.y - point.y)*(this.y - point.y));
	}

}
