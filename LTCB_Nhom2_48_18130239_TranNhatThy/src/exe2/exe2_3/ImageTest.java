package exe2.exe2_3;

import junit.framework.TestCase;

public class ImageTest extends TestCase{
	public void testConstructor() {
		new Image(118, 112, "c:/", "informal");
	}
	/*
	 * test isPortrait
	 * ex: 118, 112 => false
	 * 		112, 118 => true
	 */
	public void testIsPortrait() {
		assertTrue(new Image(112, 118, "c:/", "informal").isPortrait());
		assertFalse(new Image(118, 112, "c:/", "informal").isPortrait());
	}
	/*
	 * test size
	 * ex: 2*2 =4
	 * 3*3=9
	 */
	public void testSize() {
		assertEquals(new Image(2, 2, "c:/", "informal").size(), 4);
		assertEquals(new Image(3, 3, "c:/", "informal").size(), 9);
	}
	/*
	 * test isLarger
	 * ex: true (3,3) > (2,2) false nguoc lai
	 */
	public void testIsLarger() {
		Image i1 = new Image(3, 3, "c:/", "informal");
		Image i2 = new Image(2, 2, "c:/", "informal");
		assertTrue(i1.isLarge(i2));
		assertFalse(i2.isLarge(i1));
	}
	/*
	 * test same
	 * ex: (3, 3, "c:/", "informal") 
	 */
	public void testSame() {
		Image i1 = new Image(3, 3, "c:/", "informal");
		Image i2 = new Image(3, 3, "c:/", "informal");
		Image i3 = new Image(2, 2, "c:/", "informal");
		assertTrue(i1.same(i2));
		assertFalse(i1.same(i3));
	}
	/*
	 * test sizeString
	 * ex: (100,200) => small
	 * 		(200, 1000) => medium
	 * 		(1000, 2000) => large
	 */
	public void testSizeString() {
		Image i1 = new Image(100, 20, "c:/", "informal");
		Image i2 = new Image(200, 1000, "c:/", "informal");
		Image i3 = new Image(1000, 2000, "c:/", "informal");
		assertEquals(i1.sizeString(), "small");
		assertEquals(i2.sizeString(), "medium");
		assertEquals(i3.sizeString(), "large");
	}
}
