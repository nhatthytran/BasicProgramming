/**
 * 
 */
package exe5_2;

/**
 * @author nhatthy
 *
 */
public class ConsBook implements IBooks{
	private Book first;
	private IBooks rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsBook(Book first, IBooks rest) {
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
		if(obj == null || !(obj instanceof ConsBook))
			return false;
		else {
			ConsBook that = (ConsBook) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
}
