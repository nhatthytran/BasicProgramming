/**
 * 
 */
package exe5.exe5_7;

/**
 * @author nhatthy
 *
 */
public class MTShoppingList implements IShoppingList {
	public MTShoppingList() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	@Override
	public double howMany() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public IBrand brandList() {
		// TODO Auto-generated method stub
		return new MTBrand();
	}
	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public IShoppingList sortByPrice() {
		// TODO Auto-generated method stub
		return new MTShoppingList();
	}
	@Override
	public IShoppingList insertInPriceOrder(AnItem item) {
		// TODO Auto-generated method stub
		return new ConsShoppingList(item, new MTShoppingList());
	}
}
