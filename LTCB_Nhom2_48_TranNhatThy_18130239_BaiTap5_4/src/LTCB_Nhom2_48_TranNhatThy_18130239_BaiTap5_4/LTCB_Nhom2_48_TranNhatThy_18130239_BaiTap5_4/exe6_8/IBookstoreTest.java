/**
 * 
 */
package exe6_8;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class IBookstoreTest extends TestCase{
	
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		ABook hard = new Hardcover("abc", "Tran A", 100.0, 2000);
		ABook sale = new Sale("abd", "Tran B", 50.0, 2001);
		ABook paper = new Paperback("abe", "Tran C", 80.0, 2004);
		
		IBookstore empty = new MTBookstore();
		IBookstore b1 = new ConsBookstore(hard, empty);
		IBookstore b2 = new ConsBookstore(sale, b1);
		IBookstore b3 = new ConsBookstore(paper, b2);
	}
	/*
	 * test for thisAuthor
	 */
	public void testThisAuthor() {
		ABook hard = new Hardcover("abc", "Tran A", 100.0, 2000);
		ABook sale = new Sale("abd", "Tran B", 50.0, 2001);
		ABook paper = new Paperback("abe", "Tran A", 80.0, 2004);
		
		IBookstore empty = new MTBookstore();
		IBookstore b1 = new ConsBookstore(hard, empty);
		IBookstore b2 = new ConsBookstore(sale, b1);
		IBookstore b3 = new ConsBookstore(paper, b2);
		
		assertEquals(b3.thisAuthor("Tran A"), new ConsBookstore(paper, new ConsBookstore(hard, new MTBookstore())));
	}
}
