package log;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;

	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	// to string
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	// equals
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog))
			return false;
		else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
	@Override
	public double miles() {
		// TODO Auto-generated method stub
		return this.first.getDistance() + this.rest.miles();
	}
	@Override
	public ILog getLogs(int month, int year) {
		if(this.first.sameMonthAndYear(month, year))
			return new ConsLog(this.first, this.rest.getLogs(month, year));
		else 
			return this.rest.getLogs(month, year);
	}
	@Override
	public double milesInMonth(int month, int year) {
		if(this.first.sameMonthAndYear(month, year))
			return this.first.getDistance() + this.rest.milesInMonth(month, year);
		return this.rest.milesInMonth(month, year);
	}
	@Override
	public double maxDistance() {
		// TODO Auto-generated method stub
		return Math.max(this.first.getDistance(), this.rest.maxDistance());
	}
	@Override
	public ILog sortByDistance() {
		// TODO Auto-generated method stub
		return this.rest.sortByDistance()
				.insertInDistanceOrder(this.first);
	}
	@Override
	public ILog insertInDistanceOrder(Entry e) {
		if(e.hasDistanceShorterThan(this.first))
			return new ConsLog(e, this);
		else
			return new ConsLog(this.first, this.rest.insertInDistanceOrder(e));
	}
	@Override
	public ILog getLogByComment(String comment) {
		if(this.first.checkComment(comment))
			return new ConsLog(this.first,this.rest.getLogByComment(comment));
		return this.getLogByComment(comment);
	}
//	@Override
//	public double getMaxDistance() {
//		double d = this.first.getDistance();
//		double dr = this.rest.getMaxDistance();
//		if(d>=dr)
//			return d;
//		return dr;
//	}


}
