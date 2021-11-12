/**
 * 
 */
package exe5_4;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class GradesTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Course
		Course c1 = new Course(1, "LTCB", 4);
		Course c2 = new Course(2, "LTNC", 4);
		Course c3 = new Course(3, "CTDL", 4);
		// test for GradeRecord
		GradeRecord g1 = new GradeRecord(c1, 8.0);
		GradeRecord g2 = new GradeRecord(c2, 8.0);
		GradeRecord g3 = new GradeRecord(c3, 8.0);
		// test for MTGrades
		IGrades empty = new MTGrades();
		// test for ConsGrades
		IGrades con1 = new ConsGrades(g1, empty);
		IGrades con2 = new ConsGrades(g2, con1);
		IGrades con3 = new ConsGrades(g3, con2);
		
		IGrades all = new ConsGrades(g3, new ConsGrades(g2, new ConsGrades(g1, empty)));
		
		assertEquals(con3, all);
		
		// Test for ScoreBoard
		ScoreBoard board = new ScoreBoard("TVA", "DT", all);
	}
}
