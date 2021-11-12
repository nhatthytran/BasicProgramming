/**
 * 
 */
package exe5_2;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class BookTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Book
		Book b1 = new Book("Harry", "agh", 7.5, 2010);
		Book b2 = new Book("hello", "aghj", 45.0, 1999);
		Book b3 = new Book("gjjg", "gjjgda", 45.1, 2000);
		// test for MTBook
		IBooks empty = new MTBook();
		// test for ConsBook
		IBooks con1 = new ConsBook(b1, empty);
		IBooks con2 = new ConsBook(b2, con1);
		IBooks con3 = new ConsBook(b3, con2);
		// test for all
		IBooks all = new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, empty)));
		
		assertEquals(con3,  all);
	}
}
