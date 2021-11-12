/**
 * 
 */
package exe5_1;

/**
 * @author nhatthy
 *
 *	House: name, number of rooms, price, address
 */
public class House {
	private String name;
	private int numOfRooms;
	private double price;
	private Address address;
	/**
	 * @param name
	 * @param numOfRooms
	 * @param price
	 * @param address
	 */
	public House(String name, int numOfRooms, double price, Address address) {
		super();
		this.name = name;
		this.numOfRooms = numOfRooms;
		this.price = price;
		this.address = address;
	}
	@Override
	public String toString() {
		return "House [name=" + name + ", numOfRooms=" + numOfRooms + ", price=" + price + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof House))
			return false;
		else {
			House another = (House) obj;
			return this.name.equals(another.name)
				&& this.numOfRooms==another.numOfRooms
				&& this.price == another.price
				&& this.address.equals(another.address);
		}
	}
	
	
}
