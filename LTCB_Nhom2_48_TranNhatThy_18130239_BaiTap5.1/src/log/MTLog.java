package log;

public class MTLog implements ILog {

	// to string
	public String toString() {
		return "";
	}
	// equal
	public boolean equals(Object o) {
		if(o == null || !(o instanceof MTLog))
			return false;
		return true;
	}
	@Override
	public double miles() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	@Override
	public ILog getLogs(int month, int year) {
		// TODO Auto-generated method stub
		return new MTLog();
	}
	@Override
	public double milesInMonth(int month, int year) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double maxDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ILog sortByDistance() {
		// TODO Auto-generated method stub
		return new MTLog();
	}
	@Override
	public ILog insertInDistanceOrder(Entry e) {
		// TODO Auto-generated method stub
		return new ConsLog(e, new MTLog());
	}
	@Override
	public ILog getLogByComment(String comment) {
		// TODO Auto-generated method stub
		return new MTLog();
	}
//	@Override
//	public double getMaxDistance() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}
