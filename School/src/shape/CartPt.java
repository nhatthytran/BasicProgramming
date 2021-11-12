package shape;

public class CartPt {
	private int x;
	private int y;
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
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
	
	// computes the distance of a Rectangle to the origin of the canvas
	public double distanceToO() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	// computes the distance from center
	public double distanceCenterToO(int deltaX, int deltaY) {
		return Math.sqrt((this.x + deltaX)*(this.x + deltaX) + (this.y + deltaY)*(this.y + deltaY));
	}
	
}
