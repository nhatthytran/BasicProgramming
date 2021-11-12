/**
 * 
 */
package exe6_7;

/**
 * @author nhatthy
 *
 */
public interface IShoppingList {
	/**
	 * compute the number of items on the shopping list
	 * @return so san pham trong list
	 */
	public double howMany();
	/**
	 * 
	 * @return danh sach thuong hieu
	 */
	public IBrand brandList();
	/**
	 * Xacs dinh gia tien cao nhat trong shopping list
	 * @return gia tien cao nhat
	 */
	public double highestPrice();
	/**
	 * 
	 * @return danh sach da dc sap xep
	 * 
	 */
	public IShoppingList sortByPrice();
	/**
	 * 
	 * @param item
	 * @return
	 */
	public IShoppingList insertInPriceOrder(AnItem item);
}
