package exe2.exe2_6;

import junit.framework.TestCase;

public class QuadraticTest extends TestCase{

	/* test constructor
	 * ex: Quadratic(0,1,2)
	 * 		Quadratic(1,2,4)
	 * 		Quadratic(2,2,4)
	 */
	public void testConstructor() {
		new Quadratic(0,1,2);
		new Quadratic(1,2,4);
		new Quadratic(2,2,4);
	}
	/*
	 * test whatKind
	 * ex: Quadratic(3,2,2) => none
	 * 		Quadratic(2,4,2) => one
	 * 		Quadratic(-1,2,2) => two
	 * 		Quadratic(0,1,2) => degenerate
	 */
	public void testWhatKind() {
		Quadratic q1 = new Quadratic(3,2,2);
		Quadratic q2 = new Quadratic(2, 4, 2);
		Quadratic q3 = new Quadratic(-1, 2, 2);
		Quadratic q4 = new Quadratic(0, 1, 2);
		
		assertEquals(q1.whatKind(), "none");
		assertEquals(q2.whatKind(), "one");
		assertEquals(q3.whatKind(), "two");
		assertEquals(q4.whatKind(), "degenerate");
	}
}
