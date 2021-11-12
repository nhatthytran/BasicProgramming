package exe4.exe4_8;
/*
 * IBook: dai dien cho 3 loai sach
 */
public interface IBook {
	// 1. computes the sale price of each book
	public double salePrice();
	// 2. determines whether a book is cheaper than another book
	public boolean cheaperThan(IBook that);
	public String getAuthorName();
	// 3. determines whether a book was written by some given author which wrote another book
	public boolean sameAuthor(IBook that);

}
