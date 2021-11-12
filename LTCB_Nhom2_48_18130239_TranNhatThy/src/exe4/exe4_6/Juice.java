package exe4.exe4_6;
/*
 * Juice: dinh nghia Nuoc trai cay. Gom:
 * 	- brandName
 * 	- weight
 * 	- price
 * 	- flavor
 * 	- packageType
 */
public class Juice extends AGrocery{
	private String flavor;
	private String packageType;

	public Juice(String brandName, double weight, double price, String flavor, String type) {
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
		this.flavor = flavor;
		this.packageType = type;
	}
}
