/**
 * 
 */
package exe6_8;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class IListBookTest extends TestCase{
	
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		ABook b1 = new Hardcover("LTCB", "T", 15, 2020);
		ABook b2 = new Sale("LTCB 1", "T1", 15, 2020);
		ABook b3 = new Paperback("LTCB 2", "T", 15, 2020);
		
		IListBook empty = new MTListBook();
		IListBook lb1 = new ConsListBook(b1, empty);
		IListBook lb2 = new ConsListBook(b2, lb1);
		IListBook lb3 = new ConsListBook(b3, lb2);
	}
	/*
	 * test for thisAuthor
	 */
	public void testThisAuthor() {
		ABook b1 = new Hardcover("LTCB", "T", 15, 2020);
		ABook b2 = new Sale("LTCB 1", "T1", 15, 2020);
		ABook b3 = new Paperback("LTCB 2", "T", 15, 2020);
		
		IListBook empty = new MTListBook();
		IListBook lb1 = new ConsListBook(b1, empty);
		IListBook lb2 = new ConsListBook(b2, lb1);
		IListBook lb3 = new ConsListBook(b3, lb2);
		
		assertEquals(empty.thisAuthor("T"), empty);
		assertEquals(lb1.thisAuthor("T"), lb1);
		assertEquals(lb2.thisAuthor("T"), lb1);
		assertEquals(lb3.thisAuthor("T"), new ConsListBook(b3, lb1));
	}
	/*
	 * test for sortByTitle
	 */
	public void testSortByTitle() {
		ABook b1 = new Hardcover("LTCB 3", "Tran", 15, 2020);
		ABook b2 = new Sale("LTCB 2", "Danh", 15, 2020);
		ABook b3 = new Paperback("LTCB 1", "Ha", 15, 2020);
		
		IListBook lb1 = new MTListBook();
		IListBook lb2 = new ConsListBook(b1, lb1);
		IListBook lb3 = new ConsListBook(b2, lb2);
		IListBook lb4 = new ConsListBook(b3, lb3);
		
		assertEquals(lb1.sortByTitle(), lb1);
		assertEquals(lb2.sortByTitle(), lb2);
		assertEquals(lb3.sortByTitle(), lb3);
		assertEquals(lb4.sortByTitle(), new ConsListBook(b2, new ConsListBook(b3, lb2)));
	}
	/*
	 * test for getMaxPriceBooks
	 */
	public void testGetMaxPriceBooks() {
		ABook b1 = new Hardcover("LTCB 3", "Tran", 15, 2020);
		ABook b2 = new Sale("LTCB 2", "Danh", 20, 2020);
		ABook b3 = new Paperback("LTCB 1", "Ha", 20, 2020);
		
		IListBook lb1 = new MTListBook();
		IListBook lb2 = new ConsListBook(b1, lb1);
		IListBook lb3 = new ConsListBook(b2, lb2);
		IListBook lb4 = new ConsListBook(b3, lb3);
		
		assertEquals(lb1.getMaxPriceBooks(), lb1);
		assertEquals(lb2.getMaxPriceBooks(), lb2);
		assertEquals(lb3.getMaxPriceBooks(), new ConsListBook(b2, lb1));
		assertEquals(lb4.getMaxPriceBooks(), new ConsListBook(b3, new ConsListBook(b2, lb1)));
	}
}
