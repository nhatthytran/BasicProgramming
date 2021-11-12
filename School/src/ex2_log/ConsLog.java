package ex2_log;

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

}
