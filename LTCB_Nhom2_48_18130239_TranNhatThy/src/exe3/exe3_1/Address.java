package exe3.exe3_1;

public class Address {
	private int houseNumber;
	private String streetName;
	private String city;
	public Address(int houseNumber, String streetName, String city) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	/*
	 * kiem tra xem quang cao ngoi nha co o thanh pho minh muon ktra hay k
	 * tp do minh tu cho
	 */
	public boolean inHCMCity() {
		return this.city.equals("Ho Chi Minh");
	}
	/*
	 * ktra 2 dia chi co cung thanh pho khong?
	 */
	public boolean sameCity(Address address) {
		return this.city.equals(address.getCity());
	}
}
