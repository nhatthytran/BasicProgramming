/**
 * 
 */
package exe6_7;

/**
 * @author nhatthy
 *
 */
public class Juice extends AnItem {
	private String flavor;
	private String packageName;
	/**
	 * 
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param flavor
	 * @param packageName
	 */
	public Juice(String brandName, double weight, double price, String flavor, String packageName) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packageName = packageName;
	}
	@Override
	public String toString() {
		return "Juice [flavor=" + flavor + ", packageName=" + packageName + ", brandName=" + brandName + ", weight="
				+ weight + ", price=" + price + "]";
	}
	
}
