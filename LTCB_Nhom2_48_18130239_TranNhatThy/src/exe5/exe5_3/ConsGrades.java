/**
 * 
 */
package exe5.exe5_3;

/**
 * @author nhatthy
 * 
 * ConsGrades: first, rest
 */
public class ConsGrades implements IGrades {
	private GradeRecord first;
	private IGrades rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsGrades(GradeRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	* @return
	*/
	@Override
	public String toString() {
		return this.first + "\n" + this.rest;
	}
	/**
	* @param obj
	* @return
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsGrades))
			return false;
		else {
			ConsGrades that = (ConsGrades) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	
	
}
