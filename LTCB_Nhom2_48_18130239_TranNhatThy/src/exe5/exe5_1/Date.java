/**
 * 
 */
package exe5.exe5_1;

/**
 * @author nhatthy
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * 
	 * @param month2
	 * @param year2
	 * @return kiem tra co phai thang nam do k
	 */
	public boolean checkMonth(int month2, int year2) {
		return this.month == month2
				&& this.year == year2;
	}
	
}
