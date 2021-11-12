package exe5.exe5_8;

public class MTInventory implements Inventory {

	// to string
	public String toString() {
		return "";
	}
	/**
	 * 
	 */
	@Override
	public boolean contains(String toyName) {
		return false;
	}
	/**
	 * 
	 */
	@Override
	public boolean isBelow(double threshold) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}
	// immuatable
	@Override
	public Inventory raisePrice(double rate) {
		// TODO Auto-generated method stub
		return new MTInventory();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTInventory))
			return false;
		return true;
	}
	@Override
	public void raisePriceMutable(double rate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double averagePrice() {
		return 0;
	}
	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Inventory replaceName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Inventory eliminate(String toyName) {
		// TODO Auto-generated method stub
		return new MTInventory();
	}
	@Override
	public boolean checkName(String toyName) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
