/**
 * 
 */
package exe5_3;

/**
 * @author ADMiN
 *
 */
public class Mouth extends ARiver{
	private ARiver stream;

	/**
	 * 
	 */
	public Mouth(Location loc, double length, ARiver stream) {
		super(loc,length);
		this.stream = stream;
	}

}
