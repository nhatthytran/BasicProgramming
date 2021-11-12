package exe2.exe2_1;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase{

	// test constructor of employee
	public void testConstructor() {
		new Employee("Tran Van A", 50);
		new Employee("Tran Van B", 48);
	}
	/*
	 * test wage
	 * ex: 50 hours => 600.0
	 * 	   64 hours => 768.0
	 */
	public void testWage() {
		Employee e1 = new Employee("Tran Van A", 50);
		Employee e2 = new Employee("Tran Van B", 64);
		assertEquals(e1.wage() , 600.0);
		assertEquals(e2.wage(), 768.0);
	}
	/*
	 * test tax
	 * ex: 50 hours => 600.0 => tax: 90.0
	 * 	   64 hours => 768.0 => tax: 115.2
	 */
	public void testTax() {
		Employee e1 = new Employee("Tran Van A", 50);
		Employee e2 = new Employee("Tran Van B", 64);
		assertEquals(e1.tax() , 90.0, 0.001);
		assertEquals(e2.tax(), 115.2, 0.001);
	}
	/*
	 * test netpay
	 * ex: 50 hours => 600.0 => tax: 90.0 => netpay: 510.0
	 * 	   64 hours => 768.0 => tax: 115.2 => netpay: 652.8
	 */
	public void testNetpay() {
		Employee e1 = new Employee("Tran Van A", 50);
		Employee e2 = new Employee("Tran Van B", 64);
		assertEquals(e1.netpay() , 510.0, 0.001);
		assertEquals(e2.netpay(), 652.8, 0.001);
	}
	/*
	 * test raised wage
	 * ex: 50 hours => 600.0 => 614.0
	 * 	   64 hours => 768.0 => 782.0
	 */
	public void testRaisedWage() {
		Employee e1 = new Employee("Tran Van A", 50);
		Employee e2 = new Employee("Tran Van B", 64);
		assertEquals(e1.raisedWage() , 614.0, 0.001);
		assertEquals(e2.raisedWage(), 782.0, 0.001);
	}
	/*
	 * test check over time
	 * ex: 50 => true
	 * 110 => false
	 */
	public void testCheckOverTime() {
		Employee e1 = new Employee("Tran Van A", 50);
		Employee e2 = new Employee("Tran Van B", 110);
		assertTrue(e2.checkOverTime());
		assertFalse(e1.checkOverTime());
	}
	/*
	 * test tax extended
	 * ex: 10 hours => 120 => tax=0.0
	 * 		30 hours => 360 => tax=360*0.15=54.0
	 * 		50 hours => 600 => tax=600*0.28=168.0
	 */
	public void testTaxExtended() {
		Employee e1 = new Employee("Tran Van A", 10);
		Employee e2 = new Employee("Tran Van B", 30);
		Employee e3 = new Employee("Tran Van C", 50);
		assertEquals(e1.taxExtended(), 0.0);
		assertEquals(e2.taxExtended(), 54.0, 0.001);
		assertEquals(e3.taxExtended(), 168.0, 0.001);
	}
	/*
	 * test netpay extended
	 * ex: 10 hours => 120 => tax=0.0			=> netpay=120.0
	 * 		30 hours => 360 => tax=360*0.15=54.0 => netpay=306.0
	 * 		50 hours => 600 => tax=600*0.28=168.0 => netpay = 432.0
	 */
	public void testNetpayExtended() {
		Employee e1 = new Employee("Tran Van A", 10);
		Employee e2 = new Employee("Tran Van B", 30);
		Employee e3 = new Employee("Tran Van C", 50);
		assertEquals(e1.netpayExtended(), 120.0, 0.001);
		assertEquals(e2.netpayExtended(), 306.0, 0.001);
		assertEquals(e3.netpayExtended(), 432.0, 0.001);
	}
}
