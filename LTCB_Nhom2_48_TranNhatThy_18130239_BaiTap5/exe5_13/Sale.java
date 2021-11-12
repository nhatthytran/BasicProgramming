package exe5.exe5_13;
/*
 * Sale: dinh nghia sach ban chay
 * Giam gia 50%
 */
public class Sale extends ABook{

	public Sale(String title, String authorName, double price, int publicationYear) {
		super(title, authorName, price, publicationYear);
	}

	@Override
	public double salePrice() {
		return this.price*0.5;
	}
}
