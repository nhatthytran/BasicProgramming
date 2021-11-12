package ex3_restaurant;

public class ConsRestaurant implements IRestaurant {
	private Restaurant first;
	private IRestaurant rest;

	public ConsRestaurant(Restaurant first, IRestaurant rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	// to string
	public String toString() {
		return this.first.toString() + " \n" + this.rest.toString();
	}

	// equal
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsRestaurant))
			return false;
		else {
			ConsRestaurant that = (ConsRestaurant) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}
