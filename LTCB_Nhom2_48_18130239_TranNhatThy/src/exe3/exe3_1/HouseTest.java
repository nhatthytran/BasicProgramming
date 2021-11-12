package exe3.exe3_1;

import junit.framework.TestCase;

public class HouseTest extends TestCase{
	
	public void testAddressConstructor() {
		new Address(23, "Maple Street", "Brooklinen");
		new Address(5, "Joye Road", "Newton");
		new Address(83, "Winslow Road", "Waltham");
	}

	public void testHouseConstructor() {
		new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brooklinen"));
		new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
	}
	
	/*
	 * test hasMoreRooms()
	 * vd: h1 = new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brooklinen"))
	 *		h2 = new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"))
	 *		h1<h2 => false
	 *		h2>h1 => true
	 */
	public void testHasMoreRooms() {
		House h1 = new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brooklinen"));
		House h2 = new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		assertFalse(h1.hasMoreRooms(h2));
		assertTrue(h2.hasMoreRooms(h1));
	}
	/*
	 * test inHCMCity
	 * vd: h1 = new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Ho Chi Minh")) => true
	 *		h2 = new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton")) => false
	 */
	public void testInHCMCity() {
		House h1 = new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Ho Chi Minh"));
		House h2 = new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		assertTrue(h1.inHCMCity());
		assertFalse(h2.inHCMCity());
	}
	/*
	 * test sameCity
	 * vd: h1 = new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Ho Chi Minh"))
	 *		h2 = new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"))
	 *		h3 = new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Newton"))
	 *		h1 va h2 => false
	 *		h2 va h3 => true
	 */
	public void testSameCity() {
		House h1 = new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Ho Chi Minh"));
		House h2 = new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
		House h3 = new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Newton"));
		assertFalse(h1.sameCity(h2));
		assertTrue(h2.sameCity(h3));
	}
}
