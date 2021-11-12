package exe3.exe3_4;
/*
 * ClockTime: dinh nghia lop thoi gian. gom co:
 * - gio (hour)
 * - phut (minute)
 */
public class ClockTime {
	private int hour;
	private int minute;
	public ClockTime(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	/*
	 * ham khoi tao vao phut
	 */
	public ClockTime(int minutes) {
		this.hour = minutes/60;
		this.minute = minutes%60;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	/*
	 * the same time
	 */
	public boolean equals(Object o) {
		if(o==null || !(o instanceof ClockTime)) {
			return false;
		} else {
			ClockTime that = (ClockTime) o;
			return this.hour == that.hour
					&& this.minute == that.minute;
		}
		
	}
	public String toString() {
		return this.hour + ":" + this.minute;
	}
	/*	greaterThan 
	 * So sanh 1 ngay co lon hon 1 ngay khac khong?
	 * input:
	 *  - this day
	 *  - that day
	 * output:
	 * 	- boolean
	 */
	/*
	 * Option 1
	 */
	public boolean greaterThan(ClockTime that) {
		// TODO Auto-generated method stub
		if(this.hour > that.hour)
			return true;
		else {
			if(this.hour==that.hour) {
				if(this.minute>that.minute)
					return true;
				else
					return false;
			} else 
				return false;
		}
	}
	/*
	 * Option 2
	 */
	public boolean greaterThan2(ClockTime that) {
		return this.convertToMinutes() > that.convertToMinutes();
	}
	/*
	 * convertToMinutes
	 * Doi ClockTime ra phut
	 * Input:
	 *  - This (ClockTime)
	 * Output:
	 * 	- int (so phut)
	 */
	public int convertToMinutes() {
		return this.hour*60 + this.minute;
	}
	/*
	 * sub (tru 2 clock time)
	 * gia su rang thoi gian input phai nho hon doi tuong so sanh
	 */
	public int sub(ClockTime departure) {
		// TODO Auto-generated method stub
		return this.convertToMinutes() - departure.convertToMinutes();
	}

	
}
