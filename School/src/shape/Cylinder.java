package shape;

public class Cylinder {

	private Circle baseDisk;
	private int height;
	public Cylinder(Circle baseDisk, int height) {
		super();
		this.baseDisk = baseDisk;
		this.height = height;
	}
	
	// tinh the tich xi lanh
	public double volume() {
		return this.baseDisk.area()*height;
	}
	
	// tinh dien tich toan bo be mat cua xi lanh
	public double surface() {
		return 2*Math.PI*this.baseDisk.getRadius()*(this.baseDisk.getRadius()+height);
	}
}
