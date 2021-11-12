package exe5.exe5_8;

public class Toy {
	private String name;
	private double price;
	private int available;
	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	// to string
	public String toString() {
		return "name: " + this.name
				+ ", price: " + this.price
				+ ", available: " + this.available;
	}
	/**
	 * 
	 * @param toyName
	 * @return
	 */
	public boolean isName(String toyName) {
		return this.name.equals(toyName);
	}
	/**
	 * 
	 * @param threshold
	 * @return
	 */
	public boolean isBelow(double threshold) {
		return this.price < threshold;
	}
	public Toy raisePrice(double rate) {
		// TODO Auto-generated method stub
		return new Toy(this.name, this.price*(1+rate), this.available);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Toy))
			return false;
		else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name)
					&& this.price == that.price
					&& this.available == that.available;
		}
	}
	public void setNewPrice(double rate) {
		this.price = this.price*(1+rate);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Toy replaceName() {
		if(this.name.equals("robot"))
			return new Toy("r2d2", this.price, this.available);
		else 
			return new Toy(this.name, this.price, this.available);
	}
	public boolean checkName(String toyName) {
		// TODO Auto-generated method stub
		return this.name.equals(toyName);
	}
	
	
	
}
