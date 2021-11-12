/**
 * 
 */
package exe5.exe5_1;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class ILogTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		ILog i1 = new MTLog();
		ILog i2 = new ConsLog(new Entry(new Date(1, 1, 2021), 15, 30, "tired"), i1);
		ILog i3 = new ConsLog(new Entry(new Date(2, 1, 2021), 10, 30, "tired"), i2);
		ILog i4 = new ConsLog(new Entry(new Date(1, 2, 2021), 20, 60, "tired"), i3);
		
		assertEquals(i1.distance(1, 2021), 0, 0.01);
		assertEquals(i4.distance(1, 2021), 25, 0.01);
		assertEquals(i4.distance(2, 2021), 20, 0.01);
	}
}
