package ex1_inventory;
// Inventory: dai dien cho MTInvetory va ConsInventory
public interface Inventory {
	//
	public boolean contain(String name);
	public boolean isBelow(double threshold);
	public int howMany();
	public void raisePrice(double rate);
}
