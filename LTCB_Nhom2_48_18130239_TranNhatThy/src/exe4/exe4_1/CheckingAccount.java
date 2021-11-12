package exe4.exe4_1;
/*
 * CheckingAccount: dinh nghia tai khoan kiem tra. Gom:
 * 	so id (idNumber)
 * 	ten khach hang (customerName)
 * 	so du toi thieu (minimumBalance)
 * 	so du hien tai (currentBalance)	
 */

public class CheckingAccount extends ABankAccount{
	private double minimumBalance;
	public CheckingAccount(int idNumber, String customerName, double minimumBalance, double currentBalance) {
		this.idNumber = idNumber;
		this.customerName = customerName;
		this.minimumBalance = minimumBalance;
		this.currentBalance = currentBalance;
	}
	
}
