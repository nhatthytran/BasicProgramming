package exe4.exe4_6;
/*
 * IGrocery: dai dien cho 3 loai 
 * 	- kem (ice cream)
 * 	- cafe (coffee)
 * 	- nuoc trai cay (juice)
 */
public interface IGrocery {
	// 1. computes the unit price (cents per gram) of some grocery item
	public double unitPrice();
	// 2. determines whether the unit price of some grocery item is lower than some given amount
	public boolean lowerPrice(double amount);
	// 3. determines whether a grocery item is cheaper than some other, given one in terms of the unit cost
	public boolean cheaperThan(IGrocery item);

}
