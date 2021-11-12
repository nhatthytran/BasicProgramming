/**
 * 
 */
package exe5_1;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class HouseTest extends TestCase{
	
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Address
		Address a1 = new Address(25, "abd", "abd");
		Address a2 = new Address(48, "abd", "abd");
		Address a3 = new Address(15, "abd", "abd");
		
		// test for House
		House h1 = new House("abc", 7, 70.0, a1);
		House h2 = new House("abc", 7, 70.0, a2);
		House h3 = new House("abc", 7, 70.0, a3);
		
		// test for MTHouse
		IHouses empty = new MTHouse();
		
		// test for ConsHouse
		IHouses con1 = new ConsHouses(h1, empty);
		IHouses con2 = new ConsHouses(h2, con1);
		IHouses con3 = new ConsHouses(h3, con2);
//		System.out.println(con3);
		
		// test for all
		IHouses all = new ConsHouses(h3, new ConsHouses(h2, new ConsHouses(h1, empty)));
		
		assertEquals(con3, all);;
	}
}
