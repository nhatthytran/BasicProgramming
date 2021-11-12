/**
 * 
 */
package exe5.exe5_6;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class IDirectoryTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		PhoneRecord p1 = new PhoneRecord("Tran Van A", "0913468965");
		PhoneRecord p2 = new PhoneRecord("Tran Van B", "0913468966");
		PhoneRecord p3 = new PhoneRecord("Tran Van C", "0913468967");
		
		IDirectory empty = new MTDirectory();
		IDirectory d1 = new ConsDirectory(p1, empty);
		IDirectory d2 = new ConsDirectory(p2, d1);
		IDirectory d3 = new ConsDirectory(p3, d2);
		
	}
	/*
	 * test for whoseNumber
	 */
	public void testWhoseNumber() {
		PhoneRecord p1 = new PhoneRecord("Tran Van A", "0913468965");
		PhoneRecord p2 = new PhoneRecord("Tran Van B", "0913468966");
		PhoneRecord p3 = new PhoneRecord("Tran Van C", "0913468967");
		
		IDirectory empty = new MTDirectory();
		IDirectory d1 = new ConsDirectory(p1, empty);
		IDirectory d2 = new ConsDirectory(p2, d1);
		IDirectory d3 = new ConsDirectory(p3, d2);
		
		assertEquals(d3.whoseNumber("0913468966"), "Tran Van B");
	}
	/*
	 * test for phoneNumber
	 */
	public void testPhoneNumber() {
		PhoneRecord p1 = new PhoneRecord("Tran Van A", "0913468965");
		PhoneRecord p2 = new PhoneRecord("Tran Van B", "0913468966");
		PhoneRecord p3 = new PhoneRecord("Tran Van C", "0913468967");
		
		IDirectory empty = new MTDirectory();
		IDirectory d1 = new ConsDirectory(p1, empty);
		IDirectory d2 = new ConsDirectory(p2, d1);
		IDirectory d3 = new ConsDirectory(p3, d2);
		
		assertEquals(d3.phoneNumber("Tran Van A"), "0913468965");
	}
}
