package exe4.exe4_7;

import junit.framework.TestCase;

public class TaxiVehicleTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Cab
		ITaxiVehicle cab = new Cab(123, 4, 500);
		// test for Limo
		ITaxiVehicle limo = new Limo(24, 8, 500, 5000);
		ITaxiVehicle limo2 = new Limo(25, 8, 700, 5000);
		// test for Van
		ITaxiVehicle van = new Van(124, 6, 1000,true);
	}
	/*
	 * test for fare
	 */
	public void testFare() {
		// test for Cab
		ITaxiVehicle cab = new Cab(123, 4, 500);
		assertEquals(cab.fare(), 4*500.0);
		// test for Limo
		ITaxiVehicle limo = new Limo(24, 8, 500, 5000);
		assertEquals(limo.fare(), 5000.0);
		ITaxiVehicle limo2 = new Limo(25, 8, 700, 5000);
		assertEquals(limo2.fare(), 8*700.0);
		// test for Van
		ITaxiVehicle van = new Van(124, 6, 1000,true);
		assertEquals(van.fare(), 6*1000.0+6);
	}
	/*
	 * test for lowerPrice
	 * amount=3000
	 */
	public void testLowerPrice() {
		// test for Cab => true
		ITaxiVehicle cab = new Cab(123, 4, 500);
		assertTrue(cab.lowerPrice(3000.0));
		// test for Limo => false
		ITaxiVehicle limo = new Limo(24, 8, 500, 5000);
		assertFalse(limo.lowerPrice(3000.0));
	}
	/*
	 * test for cheaperThan
	 */
	public void testCheaperThan() {
		// test for Cab and Limo has same number of miles
		ITaxiVehicle cab = new Cab(123, 4, 500);
		ITaxiVehicle limo = new Limo(24, 8, 500, 5000);
		// => cab cheaper than limo
		assertTrue(cab.cheaperThan(limo));
		assertFalse(limo.cheaperThan(cab));
		
	}
}
