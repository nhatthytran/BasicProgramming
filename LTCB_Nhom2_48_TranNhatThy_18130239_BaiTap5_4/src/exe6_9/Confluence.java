/**
 * 
 */
package exe6_9;

/**
 * @author nhatthy
 *
 */
public class Confluence extends ARiver {
	private ARiver left;
	private ARiver right;
	/**
	 * 
	 * @param location
	 * @param length
	 * @param left
	 * @param right
	 */
	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
