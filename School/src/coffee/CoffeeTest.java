package coffee;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase{
	public void testConstructor() {
		new Coffee("Hawaiian Kona", 15.95, 100);
	}
	
	public void testCost() {
		// chi dung so sanh 2 so voi nhau
		assertEquals(new Coffee("Hawaiian Kona", 15.95, 100).cost(), 1595.0);
	}
	
	public void testPriceOver() {
		// kq tra ve true nen dung assertTrue
		assertTrue(new Coffee("Hawaiian Kona", 15.95, 100).priceOver(12));
		// kq tra ve false
		
	}

}
