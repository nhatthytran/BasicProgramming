/**
 * 
 */
package exe5.exe5_7;

/**
 * @author nhatthy
 *
 */
public class AnItem {
	protected String brandName;
	protected double weight;
	protected double price;
	/**
	 * 
	 * @param brandName
	 * @param weight
	 * @param price
	 */
	public AnItem(String brandName, double weight, double price) {
		super();
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}
	public boolean hasPriceHigherThan(AnItem first) {
		// TODO Auto-generated method stub
		return this.price>=first.price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
