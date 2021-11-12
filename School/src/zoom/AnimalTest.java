package zoom;

import junit.framework.TestCase;

public class AnimalTest extends TestCase{
	/*
	 * test cho ham constructor
	 */
	public void testConstructor() {
		// test for Lion
		IAnimal simba = new Lion("Simba", 250.0, 5.0);
		
		// test for Snake
		IAnimal snake = new Snake("Snake", 100.0, 5.0);
		
		// test for Monkey
		IAnimal monkey = new Monkey("Monkey", 50.0, "Banana");
	}
}
