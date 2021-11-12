package exe4.exe4_6;
/*
 * IceCream: dinh nghia Kem. Gom:
 * 	- brandName
 * 	- weight
 * 	- price
 * 	- flavor
 * 	- type
 */
public class IceCream extends AGrocery{
	private String flavor;
	private String type;

	public IceCream(String brandName, double weight, double price, String flavor, String type) {
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
		this.flavor = flavor;
		this.type = type;
	}
	
	
}
