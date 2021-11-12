/**
 * 
 */
package exe5.exe5_14;

/**
 * @author nhatthy
 *
 */
public class ConsListLocation implements IListLocation {
	private Location first;
	private IListLocation rest;
	public ConsListLocation(Location first, IListLocation rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
}
