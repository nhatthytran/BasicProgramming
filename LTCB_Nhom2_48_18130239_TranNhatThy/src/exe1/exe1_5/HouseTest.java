package exe1.exe1_5;

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
}
