package exe5.exe5_1;

public class Entry {
	private Date date;
	private double distance;
	private double duration;
	private String comment;
	/**
	 * 
	 * @param date
	 * @param distance
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distance, double duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	/**
	 * 
	 * @param month
	 * @param year
	 * @return
	 */
	public double distance(int month, int year) {
		if(this.date.checkMonth(month, year))
			return this.distance;
		else 
			return 0;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
