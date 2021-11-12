package exe3.exe3_2;

public class Book {
	private String title;
	private double price;
	private int yearOfPublication;
	private Author author;
	public Book(String title, double price, int yearOfPublication, Author author) {
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.author = author;
	}
	/*
	 * 1. currentBook: that checks whether the book was published in 2004 or 2003
	 * ktra lieu cuon sach co dc san xuat vao nam 2003 hay 2004 k?
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889)) => true
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890)) => true
	 * new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995)) => false
	 */
	public boolean currentBook() {
		return this.yearOfPublication==2003 || this.yearOfPublication==2004;
	}
	/*
	 * 2. currentAuthor: that determines whether a book was written by a current author (born after 1940)
	 * xd cuon sach dc viet boi tac gia sinh sau 1940
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889)) => false
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890)) => false
	 * new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995)) => true
	 */
	public boolean currentAuthor() {
		return this.author.checkAuthorYearBirth();
	}
	/*
	 * 3. thisAuthor: xac dinh tac gia cuon sach co giong voi 1 tac gia khac hay k
	 * new Author("Daniel Defoe", 1889)
	 * new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889)) => true
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890)) => false
	 * 
	 */
	public boolean thisAuthor(Author author) {
		return this.author.getName().equals(author.getName())
				&& this.author.getYearBirth()==author.getYearBirth();
	}
	/*
	 * 4. sameAuthor: that determines whether one book was written by the same author as some other book
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889))
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890))
	 * new Book("Beach Music", 9.50, 2010, new Author("Daniel Defoe", 1889))
	 * book 1 va book 2 => false
	 * book 1 va book 3 => true
	 */
	public boolean sameAuthor(Book book) {
		return this.author.getName().equals(book.getAuthor().getName())
				&& this.author.getYearBirth()==book.getAuthor().getYearBirth();
	}
	/*
	 * 5. sameGeneration: that determines whether two books were written by two authors born less than 10 year apart
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1986))
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890))
	 * new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995))
	 * book 1 va book 2 => false
	 * book 1 va book 3 => true
	 */
	public boolean sameGeneration(Book book) {
		return Math.abs(this.author.getYearBirth()-book.getAuthor().getYearBirth()) <= 10;
	}

	/*
	 * getter va setter
	 */
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
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
}
