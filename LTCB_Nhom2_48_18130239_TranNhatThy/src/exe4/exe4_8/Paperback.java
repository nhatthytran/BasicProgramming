package exe4.exe4_8;
/*
 * Paperback: dinh nghia sach bia mem
 * Khong giam gia
 */
public class Paperback extends ABook{

	public Paperback(String title, String authorName, double price, int publicationYear) {
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.publicationYear = publicationYear;
	}

	@Override
	public double salePrice() {
		return this.price;
	}
}
