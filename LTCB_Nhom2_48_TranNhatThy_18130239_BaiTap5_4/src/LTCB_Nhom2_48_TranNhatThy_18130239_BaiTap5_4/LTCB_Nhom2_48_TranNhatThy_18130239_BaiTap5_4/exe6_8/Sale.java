package exe6_8;
/*
 * Sale: dinh nghia sach ban chay
 * Giam gia 50%
 */
public class Sale extends ABook{

	public Sale(String title, String authorName, double price, int publicationYear) {
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.publicationYear = publicationYear;
	}

	@Override
	public double salePrice() {
		return this.price*0.5;
	}
}
