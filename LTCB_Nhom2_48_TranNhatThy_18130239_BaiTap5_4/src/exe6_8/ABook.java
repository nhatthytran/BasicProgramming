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
	
	/**
	 * 
	 * @param title: book name
	 * @param authorName: author name
	 * @param price: price of book
	 * @param publicationYear: publication year of book
	 */
	public ABook(String title, String authorName, double price, int publicationYear) {
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	/**
	 * 1. computes the sale price of each book
	 * @return sale price
	 */
	public abstract double salePrice();
	/**
	 * 2. determines whether a book is cheaper than another book
	 * @param that: another ABook
	 * @return is cheaper than another?
	 */
	public boolean cheaperThan(ABook that) {
		return this.salePrice()<that.salePrice();
	}
	/**
	 * 3. determines whether a book was written by some given author which wrote another book
	 * @param that: another ABook
	 * @return is has same author
	 */
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
	/**
	 * 
	 * @param author
	 * @return is authorName same author
	 */
	public boolean checkAuthor(String author) {
		if(this.authorName.equals(author))
			return true;
		return false;
	}
	public boolean smallThatByTitle(ABook first) {
		if(this.title.compareTo(first.title) <= 0)
			return false;
		else 
			return true;
	}
	public boolean checkPrice(double mprice) {
		// TODO Auto-generated method stub
		return this.price == mprice;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public boolean cheaperPriceThan(double p) {
		// TODO Auto-generated method stub
		return this.price <= p;
	}
	
	
}
