package ex1_inventory;

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
	/**
	* @param name
	* @return
	*/
	@Override
	public boolean contain(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	* @param threshold
	* @return
	*/
	@Override
	public boolean isBelow(double threshold) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	* @return
	*/
	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	* @param rate
	*/
	@Override
	public void raisePrice(double rate) {
		// TODO Auto-generated method stub
		
	}
}
