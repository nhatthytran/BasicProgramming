package exe5.exe5_7;

public class IceCream extends AnItem {
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
	public IceCream(String brandName, double weight, double price, String flavor, String packageName) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packageName = packageName;
	}
	@Override
	public String toString() {
		return "IceCream [flavor=" + flavor + ", packageName=" + packageName + ", brandName=" + brandName + ", weight="
				+ weight + ", price=" + price + "]";
	}
	
}
