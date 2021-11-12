package exe2.exe2_5;

import junit.framework.TestCase;

public class JetFuelTest extends TestCase{
	/*
	 * test constructor
	 * ex: JetFuel(2, "medium", 20000)
	 * 		JetFuel(5, "large", 30000)
	 */
	public void testConstructor() {
		new JetFuel(2, "medium", 20000);
		new JetFuel(5, "large", 30000);
	}
	/*
	 * test totalCost
	 * ex: JetFuel(2, "medium", 20000) => totalCost=40000
	 * 		JetFuel(5, "large", 30000) => totalCost=150000
	 */
	public void testTotalCost() {
		JetFuel j1 = new JetFuel(2, "medium", 20000);
		JetFuel j2 = new JetFuel(5, "large", 30000);
		assertEquals(j1.totalCost(), 40000.0);
		assertEquals(j2.totalCost(), 150000.0);
	}
	/*
	 * test discountPrice
	 * ex: JetFuel(2, "medium", 20000) => totalCost=40000<100000 => discountPrice=40000
	 * 		JetFuel(5, "large", 30000) => totalCost=150000>100000 => discountPrice=135000
	 */
	public void testDiscountPrice() {
		JetFuel j1 = new JetFuel(2, "medium", 20000);
		JetFuel j2 = new JetFuel(5, "large", 30000);
		assertEquals(j1.discountPrice(), 40000.0);
		assertEquals(j2.discountPrice(), 135000.0, 0.001);
	}
}
