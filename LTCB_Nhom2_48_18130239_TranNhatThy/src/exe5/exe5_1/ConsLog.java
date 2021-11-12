/**
 * 
 */
package exe5.exe5_1;

/**
 * @author nhatthy
 *
 */
public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public double distance(int month, int year) {
		return this.first.distance(month, year) +
				this.rest.distance(month, year);
	}
	@Override
	public double distanceMax() {
		return Math.max(this.first.getDistance(), this.rest.distanceMax());
	}
	
}
