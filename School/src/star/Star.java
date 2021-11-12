package star;

public class Star {
	String firstName;
	String lastName;
	String instrument;
	int sales;
	public Star(String firstName, String lastName, String instrument, int sales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.instrument = instrument;
		this.sales = sales;
	}
	
	// Check whether one star's sales is greater than another star's sales
	public boolean biggerSales(Star star) {
		return this.sales > star.sales;
	}
	
	// Check whether same: dung assertTrue va assertFalse de test
	public boolean same(Star star) {
		return this.firstName.equals(star.firstName)
				&& this.lastName.equals(star.lastName)
				&& this.instrument.equals(star.instrument)
				&& this.sales == this.sales;
	}
	// Check whether same 2: dung assertEqual de test
	// override equals method
	public boolean equals(Object obj) {
		// neu obj null hoac obj ko la object Star
		if(null == obj || !(obj instanceof Star))
			return false;
		else {
			Star that = (Star) obj;
			return this.firstName.equals(that.firstName)
					&& this.lastName.equals(that.lastName)
					&& this.instrument.equals(that.instrument)
					&& this.sales == that.sales;
		}
	}

}
