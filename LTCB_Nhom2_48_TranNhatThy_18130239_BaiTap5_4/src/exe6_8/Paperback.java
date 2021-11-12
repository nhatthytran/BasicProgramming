package exe6_8;
/*
 * Paperback: dinh nghia sach bia mem
 * Khong giam gia
 */
public class Paperback extends ABook{

	public Paperback(String title, String authorName, double price, int publicationYear) {
		super(title, authorName, price, publicationYear);
	}

	@Override
	public double salePrice() {
		return this.price;
	}
}
