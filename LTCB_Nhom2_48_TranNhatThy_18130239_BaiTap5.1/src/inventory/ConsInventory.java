package inventory;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;
	
	public ConsInventory(Toy first, Inventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	// to string
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	@Override
	public boolean contains(String toyName) {
		return this.first.isName(toyName)
				|| this.rest.contains(toyName);
	}
	/**
	 * 
	 */
	@Override
	public boolean isBelow(double threshold) {
		// TODO Auto-generated method stub
		return this.first.isBelow(threshold)
				&& this.rest.isBelow(threshold);
	}
	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}
	@Override
	public Inventory raisePrice(double rate) {
		return new ConsInventory(this.first.raisePrice(rate), this.rest.raisePrice(rate));
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsInventory))
			return false;
		else {
			ConsInventory that = (ConsInventory) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	@Override
	public void raisePriceMutable(double rate) {
		this.first.setNewPrice(rate);
		this.rest.raisePriceMutable(rate);
		
	}
	@Override
	public double averagePrice() {
		return (this.first.getPrice() + this.rest.totalPrice()) / (1+ this.rest.howMany());
	}
	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return this.first.getPrice() + this.rest.totalPrice();
	}
	@Override
	public Inventory replaceName() {
		return new ConsInventory(this.first.replaceName(), 
				this.rest.replaceName());

	}
	@Override
	public Inventory eliminate(String toyName) {
		if(checkName(toyName))
			return new MTInventory();
		else {
			if(!this.first.checkName(toyName)) {
				return new ConsInventory(this.first, this.rest.eliminate(toyName));
			} else {
				return this.rest.eliminate(toyName);
			}
		}
	}
	public boolean checkName(String toyName) {
		// TODO Auto-generated method stub
		return this.first.checkName(toyName) && this.rest.checkName(toyName);
	}
	
}
