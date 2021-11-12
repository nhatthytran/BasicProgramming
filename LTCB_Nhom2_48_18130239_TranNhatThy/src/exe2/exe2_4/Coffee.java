package exe2.exe2_4;

public class Coffee {
	String kind;
	double price;
	double weight;
	public Coffee(String kind, double price, double weight) {
		this.kind = kind;
		this.price = price;
		this.weight = weight;
	}

	// computes the cost of selling bulkcoffee at a specialty coffee 
	// seller from a receipt
	// tinh gia cua san pham truoc khi giam
	public double costFirst() {
		return this.price * this.weight;
	}
	/*
	 * neu costFirst() < 5000 => ko giam
	 * neu 5000<= costFirst() < 20000 => giam 10%
	 * neu costFirst() >= 20000 => giam 25%
	 */
	public double cost() {
		if(this.costFirst() < 5000) {
			return this.costFirst();
		} else if(this.costFirst() >= 5000 && this.costFirst() < 20000) {
			return this.costFirst() * 0.9;
		} else
			return this.costFirst() * 0.75;
	}
}
