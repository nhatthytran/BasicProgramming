package ex3_restaurant;

public class Restaurant {
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;

	public Restaurant(String name, String food, String priceRange, Intersection intersection) {
		super();
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}
	// to string
	public String toString() {
		return "Name: " + this.name + ", food: " + this.food + ", range price: " + this.priceRange + ", intersection: "
				+ this.intersection.toString();
	}

	// equal
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Restaurant))
			return false;
		else {
			Restaurant that = (Restaurant) obj;
			return this.name.equals(that.name) && this.food.equals(that.food) && this.priceRange.equals(that.priceRange)
					&& this.intersection.equals(that.intersection);
		}
	}

}
