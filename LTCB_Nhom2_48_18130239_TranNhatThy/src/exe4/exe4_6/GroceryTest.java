package exe4.exe4_6;

import junit.framework.TestCase;

public class GroceryTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for IceCream
		IGrocery i = new IceCream("Mario", 100, 12, "socola", "frozen yogurt");
		
		// test for Coffee
		IGrocery c = new Coffee("Malino", 500, 150, true, true);
		
		// test for Juice
		IGrocery j = new Juice("Orange Juice", 500, 50, "orange", "canned");
	}
	/*
	 * test for unitPrice()
	 */
	public void testUnitPrice() {
		// test for IceCream
		IGrocery i = new IceCream("Mario", 100, 12, "socola", "frozen yogurt");
		assertEquals(i.unitPrice(), 100.0*12);		
		// test for Coffee
		IGrocery c = new Coffee("Malino", 500, 150, true, true);
		assertEquals(c.unitPrice(), 500.0*150);
		// test for Juice
		IGrocery j = new Juice("Orange Juice", 500, 50, "orange", "canned");
		assertEquals(j.unitPrice(), 500.0*50);
	}
	/*
	 * test for lowerPrice
	 * given amount = 60000.0
	 */
	public void testLowerPrice() {
		// test for IceCream => true
		IGrocery i = new IceCream("Mario", 100, 12, "socola", "frozen yogurt");
		assertTrue(i.lowerPrice(60000.0));
		// test for Coffee => false
		IGrocery c = new Coffee("Malino", 500, 150, true, true);
		assertFalse(c.lowerPrice(60000.0));;
		// test for Juice => true
		IGrocery j = new Juice("Orange Juice", 500, 50, "orange", "canned");
		assertTrue(j.lowerPrice(60000.0));
	}
	/*
	 * test for cheaperThan
	 */
	public void testCheaperThan() {
		// test for IceCream
		IGrocery i = new IceCream("Mario", 100, 12, "socola", "frozen yogurt");		
		// test for Coffee
		IGrocery c = new Coffee("Malino", 500, 150, true, true);		
		// test for Juice
		IGrocery j = new Juice("Orange Juice", 500, 50, "orange", "canned");
		// i<c => true
		assertTrue(i.cheaperThan(c));
		// c>j => false
		assertFalse(c.cheaperThan(j));
	}
}
