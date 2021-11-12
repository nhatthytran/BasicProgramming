package exe2.exe2_7;

import junit.framework.TestCase;

public class TransactionTest extends TestCase{
	
	/*
	 * test constructor
	 * ex: Transaction("Tran Van A", 900, 2)
	 * 		Transaction("Tran Van B", 4800, 3)
	 * 		Transaction("Tran Van C", 5200, 4)
	 */
	public void testConstructor() {
		new Transaction("Tran Van A", 900, 2);
		new Transaction("Tran Van B", 4800, 3);
		new Transaction("Tran Van C", 5200, 4);
	}
	/*
	 * test interest
	 * ex: Transaction("Tran Van A", 900, 2) => interest=36
	 * 		Transaction("Tran Van B", 4800, 3) => interest=216
	 * 		Transaction("Tran Van C", 5200, 4) => interest=260
	 */
	public void testInterest() {
		Transaction t1 = new Transaction("Tran Van A", 900, 2);
		Transaction t2 = new Transaction("Tran Van B", 4800, 3);
		Transaction t3 = new Transaction("Tran Van C", 5200, 4);
		assertEquals(t1.interest(), 36.0, 0.001);
		assertEquals(t2.interest(), 216.0, 0.001);
		assertEquals(t3.interest(), 260.0, 0.001);
	}
	/*
	 * test paypack
	 * ex: Transaction("Tran Van A", 400, 2) => paypack=1
	 * 		Transaction("Tran Van B", 1400, 3) => paypack=1.25+4.5=5.75
	 * 		Transaction("Tran Van C", 2200, 4) => paypack=1.25+5+5.25=11.5
	 * 		Transaction("Tran Van D", 3000,2) => paypack=1.25+5+7.5+5=18.75
	 */
	public void testPaypack() {
		Transaction t1 = new Transaction("Tran Van A", 400, 2);
		Transaction t2 = new Transaction("Tran Van B", 1400, 3);
		Transaction t3 = new Transaction("Tran Van C", 2200, 4);
		Transaction t4 = new Transaction("Tran Van C", 3000, 4);
		assertEquals(t1.paypack(), 1.0, 0.001);
		assertEquals(t2.paypack(), 5.75, 0.001);
		assertEquals(t3.paypack(), 11.5, 0.001);
		assertEquals(t4.paypack(), 18.75, 0.001);
	}
}
