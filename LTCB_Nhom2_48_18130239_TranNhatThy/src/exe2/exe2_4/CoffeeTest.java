package exe2.exe2_4;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase{
	
	// test constructor
	/*
	 * ex: Coffee("Hawaiian Kona", 15.95, 100)
	 * 		Coffee("Moka", 22.4, 50)
	 */
	public void testConstructor() {
		new Coffee("Hawaiian Kona", 15.95, 100);
		new Coffee("Moka", 22.4, 50);
	}
	/*
	 * test cost
	 * ex: Coffee("Hawaiian Kona", 15.95, 100) => costFirst=1595 < 5000 => cost=1595
	 * Coffee("Moka", 44.8, 120) => costFirst=5376.0 => cost=5376*0.9=4838.4
	 * Coffee("Trung Nguyen", 42.0, 500) => costFirst=21000.0 => cost=21000*0.75=15750.0
	 */
	public void testCost() {
		Coffee c1 = new Coffee("Hawaiian Kona", 15.95, 100);
		Coffee c2 = new Coffee("Moka", 44.8, 120);
		Coffee c3 = new Coffee("Trung Nguyen", 42.0, 500);
		assertEquals(c1.cost(),1595.0, 0.001);
		assertEquals(c2.cost(),4838.4, 0.001);
		assertEquals(c3.cost(),15750.0, 0.001);
	}
}
