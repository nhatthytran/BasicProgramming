package exe5.exe5_5;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	// to string
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	// equal
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Date))
			return false;
		else {
			Date that = (Date) obj;
			return this.day == that.day && this.month == that.month && this.year == that.year;
		}
	}
	public boolean sameMonthAndYear(int month2, int year2) {
		// TODO Auto-generated method stub
		return this.month == month2
				&& this.year == year2;
	}
}
