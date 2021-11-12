package exe6_6;

import junit.framework.TestCase;

public class IMailMessagesTest extends TestCase {

	/*
	 * test for constructor
	 */
	public void testConstructor() {
		Mail m1 = new Mail("Tran Van A", new Date(2, 4, 2020), "Ngay thu nhat");
		Mail m2 = new Mail("Tran Van A", new Date(3, 4, 2020), "Ngay thu hai");
		Mail m3 = new Mail("Tran Van A", new Date(4, 5, 2020), "Ngay thu ba");

		IMailMessages empty = new MTMailMessage();
		IMailMessages i1 = new ConsMailMessages(m3, empty);
		IMailMessages i2 = new ConsMailMessages(m2, i1);
		IMailMessages i3 = new ConsMailMessages(m1, i2);
	}

	/*
	 * test for sortByDate
	 */
	public void testSortByDate() {
		Mail m1 = new Mail("Tran Van A", new Date(2, 4, 2020), "Ngay thu nhat");
		Mail m2 = new Mail("Tran Van A", new Date(3, 4, 2020), "Ngay thu hai");
		Mail m3 = new Mail("Tran Van A", new Date(4, 5, 2020), "Ngay thu ba");

		IMailMessages empty = new MTMailMessage();
		IMailMessages i1 = new ConsMailMessages(m3, empty);
		IMailMessages i2 = new ConsMailMessages(m2, i1);
		IMailMessages i3 = new ConsMailMessages(m1, i2);

		assertEquals(empty.sortByDate(), new MTMailMessage());
	}
}
