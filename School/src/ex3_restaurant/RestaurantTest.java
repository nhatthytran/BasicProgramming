package ex3_restaurant;

import junit.framework.TestCase;

public class RestaurantTest extends TestCase {
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Restaurant
		Restaurant r1 = new Restaurant("Chez Nous", "French", "exp.", new Intersection(7, 65));
		Restaurant r2 = new Restaurant("Das Bier", "German", "cheap", new Intersection(2, 86));
		Restaurant r3 = new Restaurant("Sun", "Chinese", "cheap", new Intersection(10, 13));
		// test for MTEmpty
		IRestaurant empty = new MTRestaurant();
		// test for ConsEmpty
		IRestaurant l1 = new ConsRestaurant(r3, empty);
		IRestaurant l2 = new ConsRestaurant(r2, l1);
		IRestaurant l3 = new ConsRestaurant(r1, l2);
		// test for IRestaurant
		IRestaurant all = new ConsRestaurant(r1, new ConsRestaurant(r2, new ConsRestaurant(r3, new MTRestaurant())));
		assertEquals(all, l3);

	}
}
