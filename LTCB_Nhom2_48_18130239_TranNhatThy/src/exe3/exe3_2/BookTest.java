package exe3.exe3_2;

import junit.framework.TestCase;

public class BookTest extends TestCase{
	public void testAuthorConstructor() {
		new Author("Daniel Defoe", 1889);
		new Author("Joseph Conrad", 1890);
		new Author("Pat Conroy", 1995);
	}
	public void testBookConstructor(){
		new Book("Robinson Crusoe",15.50,1719, new Author("Daniel Defoe", 1889));
		new Book("Heart of Darkness", 12.80, 1902, new Author("Joseph Conrad", 1890));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", 1995));
	}
	/*
	 * 1. test cuon sach co phai dc san xuat nam 2003 hoac 2004 k?
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889)) => true
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890)) => true
	 * new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995)) => false
	 */

	public void testCurrentBook() {
		Book b1 = new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889));
		Book b2 = new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890));
		Book b3 = new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995));
		assertTrue(b1.currentBook());
		assertTrue(b2.currentBook());
		assertFalse(b3.currentBook());
	}
	/*
	 * 2. test cuon sach dc viet boi tac gia sinh sau 1940
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889)) => false
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890)) => false
	 * new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995)) => true
	 */
	public void testCurrentAuthor() {
		Book b1 = new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889));
		Book b2 = new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890));
		Book b3 = new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995));
		assertFalse(b1.currentAuthor());
		assertFalse(b2.currentAuthor());
		assertTrue(b3.currentAuthor());
	}
	/*
	 * 3. test thisAuthor: xac dinh tac gia cuon sach co giong voi 1 tac gia khac hay k
	 * new Author("Daniel Defoe", 1889)
	 * new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889)) => true
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890)) => false
	 */
	public void testThisAuthor() {
		Book b1 = new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889));
		Book b2 = new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890));
		Author author = new Author("Daniel Defoe", 1889);
		assertTrue(b1.thisAuthor(author));
		assertFalse(b2.thisAuthor(author));
	}
	/*
	 * 4. sameAuthor: that determines whether one book was written by the same author as some other book
	 * new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889))
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890))
	 * new Book("Beach Music", 9.50, 2010, new Author("Daniel Defoe", 1889))
	 * book 1 va book 2 => false
	 * book 1 va book 3 => true
	 */
	public void testSameAuthor() {
		Book b1 = new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1889));
		Book b2 = new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890));
		Book b3 = new Book("Beach Music", 9.50, 2010, new Author("Daniel Defoe", 1889));
		assertTrue(b1.sameAuthor(b3));
		assertFalse(b1.sameAuthor(b2));
	}
	/*
	 * 5. sameGeneration: that determines whether two books were written by two authors born less than 10 year apart
	 * vd: new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1986))
	 * new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890))
	 * new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995))
	 * book 1 va book 2 => false
	 * book 1 va book 3 => true
	 */
	public void testSameGeneration() {
		Book b1 = new Book("Robinson Crusoe",15.50,2003, new Author("Daniel Defoe", 1986));
		Book b2 = new Book("Heart of Darkness", 12.80, 2004, new Author("Joseph Conrad", 1890));
		Book b3 = new Book("Beach Music", 9.50, 2010, new Author("Pat Conroy", 1995));
		assertFalse(b1.sameGeneration(b2));
		assertTrue(b1.sameGeneration(b3));
	}
	
	
	
	
	
	
	
	
	
}
