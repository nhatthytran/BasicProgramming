package coffee;

public class Coffee {
	String kind;
	double price;
	double weight;
	public Coffee(String kind, double price, double weight) {
		this.kind = kind;
		this.price = price;
		this.weight = weight;
	}
	// Method to compute to total cost of this coffee purchase <= a purpose statement
	// [in dollars]
	public double cost(){
		return this.price*this.weight;
	}
	
	// to determine whether(lieu) this coffee's price is more than amount
	public boolean priceOver(double amount) {
		if(this.price > amount) {
			return true;
		} else {
			return false;
		}
	}
}
