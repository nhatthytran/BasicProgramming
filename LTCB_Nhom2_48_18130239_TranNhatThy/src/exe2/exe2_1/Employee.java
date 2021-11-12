package exe2.exe2_1;

public class Employee {
	String name;
	int numberOfHours;
	public Employee(String name, int numberOfHours) {
		super();
		this.name = name;
		this.numberOfHours = numberOfHours;
	}
	
	// determines the wage of an employee from the number of hours of work.
	// suppose 12 dollars per hour.
	public double wage() {
		return this.numberOfHours*12;
	}
	// determine the tax on the gross pay
	public double tax() {
		return this.wage() * 0.15;
	}
	// determine netpay of an employee from the number of hours worked 
	// base on gross pay and tax
	public double netpay() {
		return this.wage() - this.tax();
	}
	// determine the raised wage to $14 for everyone
	public double raisedWage() {
		return this.wage() + 14;
	}
	// Check that the hours doesn’t exceed 100. If it does, the method returns false.
	// Otherwise, it returns true
	public boolean checkOverTime() {
		return this.numberOfHours > 100;
	}
	
	/*
	 * Develop the method tax, which consumes the gross pay and produces the amount of tax owed. 
	 * For a gross pay of $240 or less, the tax is 0%; 
	 * for over $240 and $480 or less, the tax rate is 15%; and 
	 * for any pay over $480, the tax rate is 28%.
	 */
	public double taxExtended() {
		double tax=0.0;
		if(this.wage() <= 240)
			tax=0.0;
		else if(this.wage() > 240 && this.wage() <= 480)
			tax = this.wage() * 0.15;
		else if(this.wage() > 480)
			tax = this.wage() * 0.28;
		return tax;
	}
	/*
	 * The method determines the net pay of an employee from the number of hours worked. 
	 * The net pay is the gross pay minus the tax. 
	 * Assume the hourly pay rate is $12
	 */
	public double netpayExtended() {
		return this.wage() - this.taxExtended();
	}
	
}
