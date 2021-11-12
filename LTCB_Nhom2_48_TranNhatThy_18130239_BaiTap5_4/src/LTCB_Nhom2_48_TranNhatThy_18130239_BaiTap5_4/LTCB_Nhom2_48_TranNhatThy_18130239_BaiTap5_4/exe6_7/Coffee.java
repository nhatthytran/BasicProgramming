/**
 * 
 */
package exe6_7;

/**
 * @author nhatthy
 *
 */
public class Coffee extends AnItem {
	private String label;
	/**
	 * 
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param label
	 */
	public Coffee(String brandName, double weight, double price, String label) {
		super(brandName, weight, price);
		this.label = label;
	}
	@Override
	public String toString() {
		return "Coffee [label=" + label + ", brandName=" + brandName + ", weight=" + weight + ", price=" + price + "]";
	}

}
