package exe4.exe4_1;
/*
 * CDAccount: dinh nghia tai khoan chung chi tien gui. Gom:
 * 	so id (idNumber)
 * 	ten khach hang (customerName)
 * 	lai suat (interestRate)
 * 	ngay dao han (maturityDate)
 * 	so du hien tai (currentBalance)	
 */
public class CDAccount extends ABankAccount{
	private double interestRate;
	private String maturityDate;
	public CDAccount(int idNumber, String customerName, double interestRate, String maturityDate,
			double currentBalance) {
		this.idNumber = idNumber;
		this.customerName = customerName;
		this.interestRate = interestRate;
		this.maturityDate = maturityDate;
		this.currentBalance = currentBalance;
	}
	
}
