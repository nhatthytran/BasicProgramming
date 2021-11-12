package exe3.exe3_1;

public class House {
	private String kind;
	private int numberOfRooms;
	private double price;
	private Address address;
	public House(String kind, int numberOfRooms, double price, Address address) {
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.price = price;
		this.address = address;
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * determines whether one house has more rooms than some other house
	 */
	public boolean hasMoreRooms(House house) {
		return this.numberOfRooms > house.numberOfRooms;
	}
	/*
	 * kiem tra xem quang cao ngoi nha co o thanh pho minh muon ktra hay k
	 * tp do minh tu cho
	 */
	public boolean inHCMCity() {
		return this.address.inHCMCity();
	}
	/*
	 * xac dinh lieu ngoi nha nay co cung thanh pho voi 1 ngoi nha khac khong
	 */
	public boolean sameCity(House house) {
		return this.address.sameCity(house.getAddress());
	}
}
