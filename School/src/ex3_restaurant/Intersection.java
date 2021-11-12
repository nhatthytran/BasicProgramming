package ex3_restaurant;

public class Intersection {
	private int avenue;
	private int street;

	public Intersection(int avenue, int street) {
		super();
		this.avenue = avenue;
		this.street = street;
	}

	// to string
	public String toString() {
		return "avenue: " + this.avenue + ", street: " + this.street;
	}

	// equal
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Intersection))
			return false;
		else {
			Intersection that = (Intersection) obj;
			return this.avenue == that.avenue && this.street == that.street;
		}
	}

}
