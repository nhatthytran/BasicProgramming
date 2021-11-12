/**
 * 
 */
package exe6_7;

/**
 * @author nhatthy
 *
 */
public class ConsBrand implements IBrand {
	private String first;
	private IBrand rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsBrand(String first, IBrand rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsBrand))
			return false;
		else {
			ConsBrand that = (ConsBrand)obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	
}
