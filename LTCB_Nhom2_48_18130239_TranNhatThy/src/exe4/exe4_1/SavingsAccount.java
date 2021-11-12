package exe4.exe4_1;
/*
 * SavingsAccount: dinh nghia tai khoan tiet kiem. Gom:
 * 	so id (idNumber)
 * 	ten khach hang (customerName)
 * 	lai suat (interestRate)
 * 	so du hien tai (currentBalance)	
 */
public class SavingsAccount extends ABankAccount{
	private double interestRate;
	public SavingsAccount(int idNumber, String customerName, double interestRate, double currentBalance) {
		this.idNumber = idNumber;
		this.customerName = customerName;
		this.interestRate = interestRate;
		this.currentBalance = currentBalance;
	}

}
