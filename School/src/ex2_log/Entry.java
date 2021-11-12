package ex2_log;

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

}
