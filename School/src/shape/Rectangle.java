package shape;

public class Rectangle {
	CartPt location;
	int width;
	int height;
	public Rectangle(CartPt location, int width, int height) {
		super();
		this.location = location;
		this.width = width;
		this.height = height;
	}
	
	public CartPt getLocation() {
		return location;
	}
	public void setLocation(CartPt location) {
		this.location = location;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// distance from Rectangle to O
	public double distanceRecToO() {
		return location.distanceToO();
	}
	
	// distance from Rectangle center to O
	public double distanceRecCenterToO() {
		return location.distanceCenterToO(this.width/2, this.height/2);
	}
}
