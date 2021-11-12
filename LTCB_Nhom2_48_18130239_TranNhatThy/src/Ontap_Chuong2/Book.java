package Ontap_Chuong2;

public class Book {
	String title;
	double price;
	int yearOfPublication;
	Author author;
	public Book(String title, double price, int yearOfPublication, Author author) {
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.author = author;
	}
	// checks whether the book was published in 2010 or 2009
	public boolean currentBook() {
		return this.yearOfPublication == 2009 || this.yearOfPublication == 2010;
	}
	// determines whether a book was written by a current Author (born after 1975)
	public boolean currentAuthor() {
		if(this.author.yearBirth > 1975) {
			return true;
		} else return false;
	}
	// determines whether a book was written by the specified author
	public boolean thisAuthor(Author auth) {
		if(this.author.name == auth.name && this.author.yearBirth == auth.yearBirth)
			return true;
		return false;
	}
	// determines whether one book was written by the same author as some other book
	public boolean sameAuthor(Book bookAnother) {
		if(thisAuthor(bookAnother.author))
			return true;
		return false;
	}
	// determines whether two books were written by two authors born less than 10 year apart
	public boolean sameGeneration(Book bookAnother) {
		if((this.author.yearBirth - bookAnother.author.yearBirth) == 10 ||
				(bookAnother.author.yearBirth - this.author.yearBirth) == 10)
			return true;
		return false;
	}
}
