package exe1.exe1_6;

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
}
