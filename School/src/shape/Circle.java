package shape;

public class Circle {
	CartPt center;
	int radius;
	public Circle(CartPt center, int radius) {
		this.center = center;
		this.radius = radius;
	};
	// tinh khoang cach den O(0,0)
	public double distanceToO() {
		return center.distanceToO();
	}
	
	// tinh chu vi hinh tron
	public double perimeter() {
		return 2*this.radius*Math.PI;
	}
	
	// tinh dien tich hinh tron
	public double area() {
		return this.radius*this.radius*Math.PI;
	}
	
	// tinh phan khoang cach cua 2 hinh tron
	public double areaRing(Circle that) {
		return Math.abs(this.area() - that.area());
	}
	public CartPt getCenter() {
		return center;
	}
	public void setCenter(CartPt center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
