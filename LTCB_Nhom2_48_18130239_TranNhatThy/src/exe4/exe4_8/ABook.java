package exe4.exe4_8;
/*
 * ABook: lop cha cua hardcover, sale, paperback book
 * 	title
 * 	authorName
 * 	price
 * 	publicationYear
 */
public abstract class ABook implements IBook{
	protected String title;
	protected String authorName;
	protected double price;
	protected int publicationYear;
	
	// 1. computes the sale price of each book
	public abstract double salePrice();
	// 2. determines whether a book is cheaper than another book
	@Override
	public boolean cheaperThan(IBook that) {
		return this.salePrice()<that.salePrice();
	}
	// 3. determines whether a book was written by some given author which wrote another book
	@Override
	public boolean sameAuthor(IBook that) {
		return this.authorName.equals(that.getAuthorName());
	}
	public String getAuthorName() {
		return authorName;
	}
	
	
}
