package exe3.exe3_4;
/*
 * Route: lop dinh nghia cho duong di. Gom:
 * - Ga khoi hanh (origin)
 * - Ga den (destination)
 */
public class Route {
	private String origin;
	private String destination;
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean checkDestination(String dest) {
		// TODO Auto-generated method stub
		return this.destination.equals(dest);
	}
	
}
