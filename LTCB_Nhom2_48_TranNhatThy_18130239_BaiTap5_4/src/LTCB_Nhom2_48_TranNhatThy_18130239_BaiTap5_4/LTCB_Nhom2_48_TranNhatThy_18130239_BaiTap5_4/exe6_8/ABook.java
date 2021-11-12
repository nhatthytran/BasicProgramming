package exe6_8;
/*
 * ABook: lop cha cua hardcover, sale, paperback book
 * 	title
 * 	authorName
 * 	price
 * 	publicationYear
 */
public abstract class ABook{
	protected String title;
	protected String authorName;
	protected double price;
	protected int publicationYear;
	
	// 1. computes the sale price of each book
	public abstract double salePrice();
	// 2. determines whether a book is cheaper than another book
	public boolean cheaperThan(ABook that) {
		return this.salePrice()<that.salePrice();
	}
	// 3. determines whether a book was written by some given author which wrote another book
	public boolean sameAuthor(ABook that) {
		return this.authorName.equals(that.getAuthorName());
	}
	public String getAuthorName() {
		return authorName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ABook))
			return false;
		else {
			ABook that = (ABook) obj;
			return this.title.equals(that.title)
					&& this.authorName.equals(that.authorName)
					&& this.price == that.price
					&& this.publicationYear == that.publicationYear;
		}
	}
	public boolean checkAuthor(String author) {
		if(this.authorName.equals(author))
			return true;
		return false;
	}
	
}
