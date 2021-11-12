/**
 * 
 */
package exe5.exe5_7;

/**
 * @author nhatthy
 *
 */
public class ConsShoppingList implements IShoppingList {
	private AnItem first;
	private IShoppingList rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsShoppingList(AnItem first, IShoppingList rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first + "\n" + this.rest;
	}

	@Override
	public double howMany() {
		return 1+this.rest.howMany();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsShoppingList))
			return false;
		else {
			ConsShoppingList that = (ConsShoppingList) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}

	@Override
	public IBrand brandList() {
		return new ConsBrand(this.first.brandName, this.rest.brandList());
	}

	@Override
	public double highestPrice() {
		double p = this.first.getPrice();
		double pr = this.rest.highestPrice();
		if(p >= pr)
			return p;
		return pr;
	}

	@Override
	public IShoppingList sortByPrice() {
		return this.rest.insertInPriceOrder(this.first);
	}

	@Override
	public IShoppingList insertInPriceOrder(AnItem item) {
		if(item.hasPriceHigherThan(this.first))
			return new ConsShoppingList(item, this);
		else
			return new ConsShoppingList(this.first, this.rest.insertInPriceOrder(item));
	}

}
