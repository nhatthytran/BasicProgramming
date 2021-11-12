/**
 * 
 */
package exe5_1;

/**
 * @author nhatthy
 *
 *	Address: number of house, street, city
 */
public class Address {
	private int numHouse;
	private String street;
	private String city;
	
	public Address(int numHouse, String street, String city) {
		super();
		this.numHouse = numHouse;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [numHouse=" + numHouse + ", street=" + street + ", city=" + city + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Address))
			return false;
		else {
			Address another = (Address) obj;
			return this.numHouse == another.numHouse
					&& this.street.equals(another.street)
					&& this.city.equals(another.city);
		}
	}
	
	

}
