package exe3.exe3_4;

import junit.framework.TestCase;

public class TrainTest extends TestCase{
	/*
	 * Test cho ham khoi tao
	 */
	public void testClockTimeConstructor() {
		new ClockTime(14, 30);
		new ClockTime(12, 00);
		new ClockTime(4, 10);
	}
	public void testScheduleConstructor() {
		new Schedule(new ClockTime(8,30), new ClockTime(14, 30));
		new Schedule(new ClockTime(8, 30), new ClockTime(12, 00));
		new Schedule(new ClockTime(9, 30), new ClockTime(4, 10));
	}
	public void testRouteConstructor() {
		new Route("Ha Noi", "Da Nang");
		new Route("Ha Noi", "Bac Ninh");
		new Route("Ha Noi", "Thai Nguyen");
	}
	public void testTrainConstructor() {
		new Train(new Schedule(new ClockTime(8,30), new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), true);
		new Train(new Schedule(new ClockTime(8, 30), new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), false);
		new Train(new Schedule(new ClockTime(9, 30), new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), true);
	}
	 /* 1. Does his destination station match the destination of the train trip?
	 * vd: diem cuoi la "Da Nang"
	 * new Train(new Schedule("Ha Noi", new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), "cloud");
	 * new Train(new Schedule("Ha Noi", new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), "sunny");
	 * new Train(new Schedule("Ha Noi", new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), "rain");
	 */
	public void testCheckDestination() {
		Train t1 = new Train(new Schedule(new ClockTime(8,30), new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), true);
		Train t2 = new Train(new Schedule(new ClockTime(8, 30), new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), false);
		Train t3 = new Train(new Schedule(new ClockTime(9, 30), new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), true);
		assertTrue(t1.checkDestination("Da Nang"));
		assertFalse(t2.checkDestination("Da Nang"));
		assertFalse(t3.checkDestination("Da Nang"));
	}
	/*
	 * 2. What time does the train start ?
	 * vd: new Train(new Schedule("Ha Noi", new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), "cloud");
	 * new Train(new Schedule("Ha Noi", new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), "sunny");
	 * new Train(new Schedule("Ha Noi", new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), "rain");
	 */
	public void testTimeStartTrain() {
		Train t1 = new Train(new Schedule(new ClockTime(8,30), new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), true);
		Train t2 = new Train(new Schedule(new ClockTime(8, 30), new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), false);
		Train t3 = new Train(new Schedule(new ClockTime(9, 30), new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), true);
		assertEquals(t1.startTime(), new ClockTime(8,30));
	}
	/*
	 * Test cho ham howLong
	 */
	public void testHowLong() {
		Train t1 = new Train(new Schedule(new ClockTime(6,30), new ClockTime(8, 30)), new Route("Ha Noi", "Da Nang"), true);
		Train t2 = new Train(new Schedule(new ClockTime(23, 30), new ClockTime(1, 30)), new Route("Ha Noi", "Bac Ninh"), false);
		Train t3 = new Train(new Schedule(new ClockTime(9, 30), new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), true);
		assertEquals(t1.howLong(),120);
		assertEquals(t2.howLong(), 120);
		assertEquals(t2.howLong1(), new ClockTime(2,0));
	}
}
