/**
 * 
 */
package exe6_7;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class IShoppingTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		AnItem ice = new IceCream("abc", 0.05, 5.0, "socola", "cake");
		AnItem coffee = new Coffee("Trung Nguyen", 1.0, 20.0, "abc");
		AnItem juice = new Juice("Ora", 0.5, 20.0, "orange", "can");
		
		IShoppingList empty = new MTShoppingList();
		IShoppingList s1 = new ConsShoppingList(ice, empty);
		IShoppingList s2 = new ConsShoppingList(coffee, s1);
		IShoppingList s3 = new ConsShoppingList(juice, s2);
	}
	/*
	 * test for howMany()
	 */
	public void testHowMany() {
		AnItem ice = new IceCream("abc", 0.05, 5.0, "socola", "cake");
		AnItem coffee = new Coffee("Trung Nguyen", 1.0, 20.0, "abc");
		AnItem juice = new Juice("Ora", 0.5, 20.0, "orange", "can");
		
		IShoppingList empty = new MTShoppingList();
		IShoppingList s1 = new ConsShoppingList(ice, empty);
		IShoppingList s2 = new ConsShoppingList(coffee, s1);
		IShoppingList s3 = new ConsShoppingList(juice, s2);
		
		assertEquals(s3.howMany(), 3.0);
	}
	/*
	 * test for brandList
	 */
	public void testBrandList() {
		AnItem ice = new IceCream("abc", 0.05, 5.0, "socola", "cake");
		AnItem coffee = new Coffee("Trung Nguyen", 1.0, 20.0, "abc");
		AnItem juice = new Juice("Ora", 0.5, 20.0, "orange", "can");
		
		IShoppingList empty = new MTShoppingList();
		IShoppingList s1 = new ConsShoppingList(ice, empty);
		IShoppingList s2 = new ConsShoppingList(coffee, s1);
		IShoppingList s3 = new ConsShoppingList(juice, s2);
		
		assertEquals(s2.brandList(), new ConsBrand("abc", new ConsBrand("Trung Nguyen", new MTBrand())));
	}
	/*
	 * test for highestPrice
	 */
	public void testHighestPrice() {
		AnItem ice = new IceCream("abc", 0.05, 5.0, "socola", "cake");
		AnItem coffee = new Coffee("Trung Nguyen", 1.0, 20.0, "abc");
		AnItem juice = new Juice("Ora", 0.5, 20.0, "orange", "can");
		
		IShoppingList empty = new MTShoppingList();
		IShoppingList s1 = new ConsShoppingList(ice, empty);
		IShoppingList s2 = new ConsShoppingList(coffee, s1);
		IShoppingList s3 = new ConsShoppingList(juice, s2);
		
		assertEquals(empty.highestPrice(), 0.0);
		assertEquals(s1.highestPrice(), 5.0);
	}

}
