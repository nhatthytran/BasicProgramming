package exe4.exe4_6;
/*
 * AGrocery: lop cha cua Ice Cream, Coffee, Juice. Gom 3 thuoc tinh chung:
 * 	- ten thuong hieu (brandName)
 * 	- can nang (weight)
 * 	- gia (price)
 */
public class AGrocery implements IGrocery {
	protected String brandName;
	protected double weight;
	protected double price;
	// 1. computes the unit price (cents per gram) of some grocery item
	@Override
	public double unitPrice() {
		return this.weight*this.price;
	}
	// 2. determines whether the unit price of some grocery item is lower than some given amount
	@Override
	public boolean lowerPrice(double amount) {
		return this.unitPrice()<amount;
	}
	// 3. determines whether a grocery item is cheaper than some other, given one in terms of the unit cost. 
	@Override
	public boolean cheaperThan(IGrocery item) {
		return this.unitPrice()<item.unitPrice();
	}

}
