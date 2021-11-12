package exe4.exe4_6;
/*
 * Coffee: dinh nghia Cafe. Gom:
 * 	- brandName
 * 	- weight
 * 	- price
 * 	- regular
 * 	- decaffeinated
 */
public class Coffee extends AGrocery{
	private boolean regular;
	private boolean decaffeinated;
	public Coffee(String brandName, double weight, double price, boolean regular, boolean decaffeinated) {
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
		this.regular = regular;
		this.decaffeinated = decaffeinated;
	}
	
}
