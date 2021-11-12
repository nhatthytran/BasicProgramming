package exe6_5;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;

	public Entry(Date date, double distance, int duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	// to string
	public String toString() {
		return "date: " + this.date.toString() + ", distance: " + this.distance + ", duration: " + this.duration
				+ ", comment: " + this.comment;
	}

	// equal
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Entry))
			return false;
		else {
			Entry that = (Entry) obj;
			return this.date.equals(that.date) && this.distance == that.distance && this.duration == that.duration
					&& this.comment.equals(that.comment);
		}
	}
	public double getDistance() {
		return this.distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean sameMonthAndYear(int month, int year) {
		// TODO Auto-generated method stub
		return this.date.sameMonthAndYear(month, year);
	}
	// dao nguoc dau lai
	public boolean hasDistanceShorterThan(Entry first) {
		// TODO Auto-generated method stub
		return this.distance <= first.distance;
	}
	public boolean checkComment(String comment2) {
		// TODO Auto-generated method stub
		return this.comment.equals(comment2);
	}
	public double speed() {
		// TODO Auto-generated method stub
		return this.distance/this.duration;
	}
	public boolean hasSpeedFasterThan(Entry first) {
		// TODO Auto-generated method stub
		return this.speed() >= first.speed();
	}
	

}
