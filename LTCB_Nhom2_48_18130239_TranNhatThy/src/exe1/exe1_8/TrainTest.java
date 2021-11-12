package exe1.exe1_8;

import junit.framework.TestCase;

public class TrainTest extends TestCase{
	public void testClockTimeConstructor() {
		new ClockTime(14, 30);
		new ClockTime(12, 00);
		new ClockTime(4, 10);
	}
	public void testScheduleConstructor() {
		new Schedule("Ha Noi", new ClockTime(14, 30));
		new Schedule("Ha Noi", new ClockTime(12, 00));
		new Schedule("Ha Noi", new ClockTime(4, 10));
	}
	public void testRouteConstructor() {
		new Route("Ha Noi", "Da Nang");
		new Route("Ha Noi", "Bac Ninh");
		new Route("Ha Noi", "Thai Nguyen");
	}
	public void testTrainConstructor() {
		new Train(new Schedule("Ha Noi", new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), "cloud");
		new Train(new Schedule("Ha Noi", new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), "sunny");
		new Train(new Schedule("Ha Noi", new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), "rain");
	}
}
