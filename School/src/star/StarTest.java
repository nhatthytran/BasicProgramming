package star;

import junit.framework.TestCase;

public class StarTest extends TestCase{

	public void testEquals() {
		assertEquals(new Star("Abba","John", "volca", 500), new Star("Abba","John", "volca", 500));
	}
}
