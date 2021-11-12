package ex1_inventory;

public class Toy {
	private String name;
	private double price;
	private int available;
	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	// to string
	public String toString() {
		return "name: " + this.name
				+ ", price: " + this.price
				+ ", available: " + this.available;
	}
}
