package exe5.exe5_13;
/*
 * Hardcover: dinh nghia sach bia cung.
 * Giam gia 20%
 */
public class Hardcover extends ABook{

	public Hardcover(String title, String authorName, double price, int publicationYear) {
		super(title, authorName, price, publicationYear);
	}
	
	@Override
	public double salePrice() {
		return this.price*0.8;
	}
}
