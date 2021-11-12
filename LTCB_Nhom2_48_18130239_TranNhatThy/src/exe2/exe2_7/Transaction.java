package exe2.exe2_7;

public class Transaction {
	String name;
	double deposit;
	int maturity;
	public Transaction(String name, double deposit, int maturity) {
		this.name = name;
		this.deposit = deposit;
		this.maturity = maturity;
	}
	/*
	 * It consumes a deposit amount and produces the actual amount of interest that the money earns in a year. 
	 * The bank pays a flat 4% per year for deposits of up to $1,000, 
	 * a flat 4.5% for deposits of up to $5,000, 
	 * and a flat 5% for deposits of more than $5,000 
	 */
	public double interest() {
		if(this.deposit <= 1000)
			return this.deposit * 0.04;
		else if(this.deposit >1000 && this.deposit <= 5000)
			return this.deposit * 0.045;
		else
			return this.deposit * 0.05;
	}
	/*
	 * consumes a charge amount and computes the corresponding pay-back amount.
	 * 
	 */
	public double paypack() {
		if(this.deposit <= 500)
			return this.deposit * 0.0025;
		else if(this.deposit > 500 && this.deposit <=1500)
			return 500*0.0025 + (this.deposit-500)*0.005;
		else if(this.deposit > 1500 && this.deposit <= 2500)
			return 500*0.0025 + 1000*0.005 + (this.deposit - 1500)*0.0075;
		else
			return 500*0.0025 + 1000*0.005 + 1000*0.0075 + (this.deposit - 2500)*0.01;
	}
}
