package exe2.exe2_5;

public class JetFuel {
	int quantitySold;
	String qualityLevel;
	double basePrice;
	public JetFuel(int quantitySold, String qualityLevel, int basePrice) {
		this.quantitySold = quantitySold;
		this.qualityLevel = qualityLevel;
		this.basePrice = basePrice;
	}
	// computes the cost of the sale
	public double totalCost() {
		return this.quantitySold * this.basePrice;
	}
	// computes the discounted price
	// The buyer gets a 10% discount if the sale is for more than 100,000 gallons
	public double discountPrice() {
		if(this.totalCost() > 100000)
			return this.totalCost() * 0.9;
		else
			return this.totalCost();
	}
}
