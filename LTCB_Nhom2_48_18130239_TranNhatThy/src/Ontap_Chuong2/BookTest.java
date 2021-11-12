package Ontap_Chuong2;

import junit.framework.TestCase;

public class BookTest extends TestCase{
	
	public void testAuthorConstructor() {
		new Author("Daniel Defoe",1975);
		new Author("Joseph Conrad", 1980);
		new Author("Pat Conroy", 1970);
	}
	
	public void testBookConstructor() {
		new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975));
		new Book("Heart of Darkness", 12.80, 2010, new Author("Joseph Conrad", 1980));
		new Book("Beach Music", 9.50, 2009, new Author("Pat Conroy", 1970));
	}
	
	// checks whether the book was published in 2010 or 2009
	public void testCurrentBook() {
		assertFalse(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).currentBook());
		assertTrue(new Book("Heart of Darkness", 12.80, 2010, new Author("Joseph Conrad", 1980)).currentBook());
	}
	
	// determines whether a book was written by a current author (born after 1975)
	public void testCurrentAuthor() {
		assertFalse(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).currentAuthor());
		assertTrue(new Book("Heart of Darkness", 12.80, 2010, new Author("Joseph Conrad", 1980)).currentAuthor());
	}
	
	// determines whether a book was written by the specified author
	public void testThisAuthor() {
		assertTrue(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).thisAuthor(new Author("Daniel Defoe",1975)));
		assertFalse(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).thisAuthor(new Author("Joseph Conrad", 1980)));
	}
	
	// determines whether one book was written by the same author as some other book
	public void testSameAuthor() {
		assertTrue(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).sameAuthor(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975))));
		assertFalse(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).sameAuthor(new Book("Heart of Darkness", 12.80, 2010, new Author("Joseph Conrad", 1980))));
	}
	
	// determines whether two books were written by two authors born less than 10 year apart
	public void testSameGeneration() {
		assertFalse(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1975)).sameGeneration(new Book("Beach Music", 9.50, 2009, new Author("Pat Conroy", 1970))));
		assertTrue(new Book("Robinson Crusoe", 15.50, 2000, new Author("Daniel Defoe",1985)).sameGeneration(new Book("Heart of Darkness", 12.80, 2010, new Author("Joseph Conrad", 1975))));
	}
}
