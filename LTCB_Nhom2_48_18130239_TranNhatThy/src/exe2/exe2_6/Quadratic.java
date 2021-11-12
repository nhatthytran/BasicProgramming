package exe2.exe2_6;

public class Quadratic {
	// Phuong trinh bac 2 co ba he so ax2 + bx + c = 0
	double a;
	double b;
	double c;
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/*
	 * determines whether the equation is degenerate and, 
	 * if not, how many solutions the equation has. 
	 * The method produces one of four symbols: "degenerate", "two", "one", or "none".
	 * de xac dinh duoc no thuoc loai phuong trinh nao, can co ham tinh delta
	 */
	// delta=b^2-4ac
	public double computeDelta() {
		return this.b*this.b - 4*this.a*this.c;
	}
	public String whatKind() {
		if(this.a == 0) {
			return "degenerate";
		} else {
			if(this.computeDelta() < 0)
				return "none";
			else if(this.computeDelta() == 0){
				return "one";
			} else 
				return "two";
		}
	}
}
