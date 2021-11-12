package ex2_log;

import junit.framework.TestCase;

public class LogTest extends TestCase{
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
}
