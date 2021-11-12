package ex2_log;

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
}
