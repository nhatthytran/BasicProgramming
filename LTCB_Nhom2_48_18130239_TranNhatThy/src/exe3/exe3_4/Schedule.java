package exe3.exe3_4;

/*
 * Schedule: dinh nghia lich chay cua tau.
 * Gom co thong tin: 
 * - thoi gian bat dau (departure)
 * - thoi gian den (arrival)
 */
public class Schedule {
	private ClockTime departure;
	private ClockTime arrival;

	public Schedule(ClockTime departure, ClockTime arrivalTimes) {
		super();
		this.departure = departure;
		this.arrival = arrivalTimes;
	}

	/*
	 * getter/setter
	 */
	public ClockTime getDeparture() {
		return departure;
	}

	public void setDeparture(ClockTime departure) {
		this.departure = departure;
	}

	public ClockTime getArrivalTimes() {
		return arrival;
	}

	public void setArrival(ClockTime arrivalTimes) {
		this.arrival = arrivalTimes;
	}
	/*
	 * su dung de tinh thoi gian cua 1 lich tau
	 * gia su: chay toi da 24h
	 * 	- neu chay trong 1 ngay (arrival > departure)
	 * 	6:30 => 8:30 : 120p
	 * 	- neu chay tu ngay nay den ngay hom sau (arrival < departure)
	 * 	23:00 => 1:00 :120p
	 */
	public int howLong() {
		// TODO Auto-generated method stub
		if (this.arrival.greaterThan(this.departure)) {
			return this.arrival.sub(this.departure);
		} else {
			return new ClockTime(24,0).sub(this.departure)
					+ this.arrival.sub(new ClockTime(0,0));
		}
	}
}
