package exe4.exe4_1;

import junit.framework.TestCase;

public class BankAccountTest extends TestCase{
	
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Checking Account
		IBankAccount checking = new CheckingAccount(1729, "Earl Gray", 500.0, 1250.0);
		
		// test for Savings Account
		IBankAccount saving = new SavingsAccount(2992, "Annie Proulx", 0.035, 800.0);
		
		// test for CD Account
		IBankAccount cd = new CDAccount(4104, "Ima Flatt", 0.04, "June 1, 2005", 10123.0);
	}
}
