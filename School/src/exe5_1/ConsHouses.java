/**
 * 
 */
package exe5_1;

/**
 * @author nhatthy
 *
 */
public class ConsHouses implements IHouses{
	private House first;
	private IHouses rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsHouses(House first, IHouses rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first + "\n" + this.rest;
	}
	// equals
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsHouses))
			return false;
		else {
			ConsHouses another = (ConsHouses) obj;
			return this.first.equals(another.first)
					&& this.rest.equals(another.rest);
		}
	}
	
	
	
}
