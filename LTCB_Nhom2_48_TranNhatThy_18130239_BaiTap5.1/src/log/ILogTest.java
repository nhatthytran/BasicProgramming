package log;

import junit.framework.TestCase;

public class ILogTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Entry
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		// test for Empty log
		ILog empty = new MTLog();
		// test for ConsLog
		ILog l1 = new ConsLog(e3, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e1, l2);
		// test for ILog
		ILog all = new ConsLog(e1, new ConsLog(e2, new ConsLog(e3, new MTLog())));
		assertEquals(l3, all);
	}
	/*
	 * test for miles()
	 */
	public void testMiles() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		
		assertEquals(empty.miles(), 0.0);
		assertEquals(l1.miles(), 5.0);
		assertEquals(l2.miles(), 8.0);
	}
	/*
	 * test for getLogs
	 */
	public void testGetLogs() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		
		assertEquals(empty.getLogs(6, 2005), new MTLog());
		assertEquals(l1.getLogs(6, 2005), new MTLog());
		assertEquals(l2.getLogs(6, 2005), new ConsLog(e2, new MTLog()));
	}
	/*
	 * test for milesInMonth
	 */
	public void testMilesInMonth() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		
		assertEquals(empty.milesInMonth(6, 2005), 0.0);
		assertEquals(l2.milesInMonth(6, 2005), 3.0);
		assertEquals(l3.milesInMonth(6, 2005), 29.0);
	}
	/*
	 * test for maxDistance
	 */
	public void testMaxDistance() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		
		assertEquals(l1.maxDistance(), 5.0);
		assertEquals(l3.maxDistance(), 26.0);
	}
	/*
	 * test for sortByDistance
	 */
	public void testSortByDistance() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e1, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		
		assertEquals(empty.sortByDistance(), new MTLog());
		assertEquals(l1.sortByDistance(), new ConsLog(e1, new MTLog()));
		assertEquals(l2.sortByDistance(), new ConsLog(e2, new ConsLog(e1, new MTLog())));
	}
}
