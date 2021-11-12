/**
 * 
 */
package exe5_4;

/**
 * @author nhatthy
 *
 *	Course: number, title, credits
 */
public class Course {
	private int number;
	private String title;
	private int credits;
	/**
	 * 
	 * @param number
	 * @param title
	 * @param credits
	 */
	public Course(int number, String title, int credits) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
	}

	/**
	* @return
	*/
	@Override
	public String toString() {
		return this.number + " - " + this.title + " - " + this.credits;
	}
	/**
	* @param obj
	* @return
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Course))
			return false;
		else {
			Course that = (Course) obj;
			return this.number == that.number
					&& this.title.equals(that.title)
					&& this.credits == that.credits;
		}
	}
	
}
