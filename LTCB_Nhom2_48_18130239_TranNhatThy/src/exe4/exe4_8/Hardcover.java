package exe4.exe4_8;
/*
 * Hardcover: dinh nghia sach bia cung.
 * Giam gia 20%
 */
public class Hardcover extends ABook{

	public Hardcover(String title, String authorName, double price, int publicationYear) {
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.publicationYear = publicationYear;
	}

	@Override
	public double salePrice() {
		return this.price*0.8;
	}
}
