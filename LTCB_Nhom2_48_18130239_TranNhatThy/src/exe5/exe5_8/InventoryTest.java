package exe5.exe5_8;

import junit.framework.TestCase;

public class InventoryTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Toy
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05,3);
		
		// test for MTInventory
		Inventory empty = new MTInventory();
		
		// test for ConsInventory
		Inventory i1 = new ConsInventory(doll, empty);
		Inventory i2 = new ConsInventory(robot, i1);
			
		// test for Inventory
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(doll, new MTInventory())));
	}
	/*
	 * test for contains()
	 */
	public void testContains() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05,3);
		
		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(doll, empty);
		Inventory i2 = new ConsInventory(robot, i1);
			
		assertFalse(empty.contains("doll"));
		assertFalse(i1.contains("robot"));
		assertTrue(i1.contains("doll"));
		assertTrue(i2.contains("robot"));
	}
	/*
	 * test for isBelow()
	 */
	public void testIsBelow() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05,3);
		
		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(doll, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		
		assertTrue(empty.isBelow(20));
		assertTrue(i1.isBelow(20));
		assertFalse(i2.isBelow(20));
	}
	/*
	 * test for howMany()
	 */
	public void testHowMany() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05,3);
		
		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(doll, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		
		assertEquals(empty.howMany(), 0);
		assertEquals(i1.howMany(), 1);
		assertEquals(i2.howMany(), 2);
	}
	/*
	 * test for raisePrice() - immutable
	 */
	public void testRaisePrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.0, 3);
		Toy gun = new Toy ("gun", 15.0,4);

		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		assertEquals(all.raisePrice(0.05),
				new ConsInventory(new Toy("doll", 18.8475, 5),
						new ConsInventory(new Toy("robot", 23.1, 3),
								new ConsInventory(new Toy("gun", 15.75, 4),
										new MTInventory()))));

	}
	/*
	 * test for raisePriceMutable() - mutable
	 */
	public void testRaisePriceMutable() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.0, 3);
		Toy gun = new Toy ("gun", 15.0,4);

		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		all.raisePriceMutable(0.05);
		assertEquals(all,
				new ConsInventory(new Toy("doll", 18.8475, 5),
						new ConsInventory(new Toy("robot", 23.1, 3),
								new ConsInventory(new Toy("gun", 15.75, 4),
										new MTInventory()))));
		

	}
	/*
	 * test for avaragePrice()
	 */
	public void testAvaragePrice() {
		Toy doll = new Toy("doll", 18.0, 5);
		Toy robot = new Toy("robot", 22.0, 3);
		Toy gun = new Toy ("gun", 11.0,4);
		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		assertEquals(all.averagePrice(), 17.0);
	}
	/*
	 * test for replaceName()
	 */
	public void testReplaceName() {
		Toy doll = new Toy("doll", 18.0, 5);
		Toy robot = new Toy("robot", 22.0, 3);
		Toy gun = new Toy ("gun", 15.0, 4);

		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		assertEquals(all.replaceName(),
				new ConsInventory(doll, 
						new ConsInventory(new Toy("r2d2", 22.0, 3), 
								new ConsInventory(gun, new MTInventory()))));
	}
	/*
	 * test for eliminate()
	 */
	public void testEliminate() {
		Toy doll = new Toy("doll", 18.0, 5);
		Toy robot = new Toy("robot", 22.0, 3);
		Toy gun = new Toy ("gun", 15.0, 4);

		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		
		assertEquals(all.eliminate("doll"), new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
	}
}
