package exe4.exe4_8;

import junit.framework.TestCase;

public class BookTest extends TestCase{

	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Hardcover book
		IBook hard = new Hardcover("hard", "abc", 12.5, 2004);
		// test for Sale book
		IBook sale = new Sale("sale", "abd", 24.5, 2005);
		// test for Paperback book
		IBook paper = new Paperback("paper", "abc", 24.6, 2012);
	}
	/*
	 * test for salePrice
	 */
	public void testSalePrice() {
		// test for Hardcover book => 12.5*0.8
		IBook hard = new Hardcover("hard", "abc", 12.5, 2004);
		assertEquals(hard.salePrice(), 12.5*0.8);
		// test for Sale book => 24.5*0.5
		IBook sale = new Sale("sale", "abd", 24.5, 2005);
		assertEquals(sale.salePrice(), 24.5*0.5);
		// test for Paperback book => 24.6
		IBook paper = new Paperback("paper", "abc", 24.6, 2012);
		assertEquals(paper.salePrice(), 24.6);
	}
	/*
	 * test for cheaperThan
	 */
	public void testCheaperThan() {
		// hard have salePrice < sale have salePrice
		// => true
		IBook hard = new Hardcover("hard", "abc", 12.5, 2004);
		IBook sale = new Sale("sale", "abd", 24.5, 2005);
		assertTrue(hard.cheaperThan(sale));
		assertFalse(sale.cheaperThan(hard));
	}
	/*
	 * test for sameAuthor
	 */
	public void testSameAuthor() {
		// hard and paper => true
		// hard and sale => false
		IBook hard = new Hardcover("hard", "abc", 12.5, 2004);
		IBook sale = new Sale("sale", "abd", 24.5, 2005);
		IBook paper = new Paperback("paper", "abc", 24.6, 2012);
		assertTrue(hard.sameAuthor(paper));
		assertFalse(hard.sameAuthor(sale));
	}
}
