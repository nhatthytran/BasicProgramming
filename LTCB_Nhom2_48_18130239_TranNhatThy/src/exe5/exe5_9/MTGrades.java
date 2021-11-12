/**
 * 
 */
package exe5.exe5_9;

/**
 * @author nhatthy
 *
 */
public class MTGrades implements IGrades {
	
	/**
	 * 
	 */
	public MTGrades() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "";
	}
	@Override
	public int howManyCredits() {
		return 0;
	}
	@Override
	public double gradeAverage() {
		return 0;
	}
	@Override
	public IGrades sortByGradeDec() {
		return new MTGrades();
	}
	@Override
	public IGrades greaterThanList(double gradeOver) {
		return new MTGrades();
	}
	@Override
	public IGrades insertInGradeOrder(GradeRecord g) {
		return new ConsGrades(g, new MTGrades());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTGrades))
			return false;
		return true;
	}
}
