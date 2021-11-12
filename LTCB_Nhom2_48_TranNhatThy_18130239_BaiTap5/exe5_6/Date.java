/**
 * 
 */
package exe6_6;

/**
 * @author nhatthy
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * Dinh nghia ngay
	 * @param day: ngay
	 * @param month: thang
	 * @param year: nam
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean hasNearThan(Date date) {
		if(this.year < date.year) {
			return true;
		} else if(this.year == date.year) {
			if(this.month < date.month) {
				return true;
			} else if(this.month == date.month) {
				if(this.day < date.day)
					return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Date))
			return false;
		else {
			Date that = (Date) obj;
			return this.day == that.day 
					&& this.month == that.month
					&& this.year == that.year;
		}
	}
	
	
}
