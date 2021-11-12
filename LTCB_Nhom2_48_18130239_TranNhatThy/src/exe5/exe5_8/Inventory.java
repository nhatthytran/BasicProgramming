package exe5.exe5_8;
// Inventory: dai dien cho MTInvetory va ConsInventory
public interface Inventory {
	/**
	 * 
	 * @param toyName
	 * @return inventory co chua toyName khong
	 */
	public boolean contains(String toyName);
	/**
	 * 
	 * @param price
	 * @return kiem tra tat ca gia co thap hon nguong gia
	 */
	public boolean isBelow(double threshold);
	/**
	 * 
	 * @return so san pham trong inventory
	 */
	public int howMany();
	/**
	 * 
	 * @param rate
	 * @return inventory with rate
	 * raise all prices of toys
	 * in the Inventory with rate
	 * (Immuatable)
	 */
	public Inventory raisePrice(double rate);
	/**
	 * 
	 * @param rate
	 */
	public void raisePriceMutable(double rate);
	/**
	 * 
	 * @return trung binh gia cua tat ca do choi
	 */
	public double averagePrice();
	/**
	 * 
	 * @return tong gia so do choi
	 */
	public double totalPrice();
	/**
	 * 
	 * @return ten da bi thay the
	 */
	public Inventory replaceName();
	/**
	 * @param toyName
	 * @return inventory co ten = toyName
	 */
	public Inventory eliminate(String toyName);
	/**
	 * 
	 * @param toyName
	 * @return
	 */
	public boolean checkName(String toyName);
}
