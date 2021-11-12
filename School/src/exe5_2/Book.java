/**
 * 
 */
package exe5_2;

/**
 * @author nhatthy
 *	Book: title, author, price, publicationYear
 */
public class Book {
	private String title;
	private String author;
	private double price;
	private int publicationYear;
	/**
	 * @param title
	 * @param author
	 * @param price
	 * @param publicationYear
	 */
	public Book(String title, String author, double price, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publicationYear="
				+ publicationYear + "]";
	}
	/**
	* @param obj
	* @return
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Book))
			return false;
		else {
			Book that = (Book) obj;
			return this.title.equals(that.title)
					&& this.author.equals(that.author)
					&& this.price == that.price
					&& this.publicationYear == that.publicationYear;
		}
	}
}
