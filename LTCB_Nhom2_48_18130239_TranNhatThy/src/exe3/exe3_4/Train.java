package exe3.exe3_4;

public class Train {
	private Schedule schedule;
	private Route route;
	private boolean local;
	public Train(Schedule schedule, Route route, boolean weatherLocal) {
		this.schedule = schedule;
		this.route = route;
		this.local = weatherLocal;
	}
	/*
	 * 1. Does his destination station match the destination of the train trip?
	 * input:
	 * 	- Train (Schedule schedule, Route route, boolean local)
	 * 	- his destination (String)
	 * output:
	 * 	- boolean
	 */
	public boolean checkDestination(String dest) {
		return this.route.checkDestination(dest);
	}
	/*
	 * 2. What time does the train start ?
	 * vd: new Train(new Schedule("Ha Noi", new ClockTime(14, 30)), new Route("Ha Noi", "Da Nang"), "cloud");
	 * new Train(new Schedule("Ha Noi", new ClockTime(12, 00)), new Route("Ha Noi", "Bac Ninh"), "sunny");
	 * new Train(new Schedule("Ha Noi", new ClockTime(4, 10)), new Route("Ha Noi", "Thai Nguyen"), "rain");
	 */
	public ClockTime startTime() {
		return this.schedule.getDeparture();
	}
	/*
	 * 3. How long does the train trip take?
	 * Assumption(Gia su/ Gia thiet): tau chay toi da 24h
	 * input:
	 * 	- Train(Schedule schedule, Route route, boolean local)
	 * ouput:
	 * 	- so phut
	 */
	public int howLong() {
		return this.schedule.howLong();
	}
	public ClockTime howLong1() {
		return new ClockTime(this.schedule.howLong());
	}
}
