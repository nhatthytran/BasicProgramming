package ex1_inventory;

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
}
