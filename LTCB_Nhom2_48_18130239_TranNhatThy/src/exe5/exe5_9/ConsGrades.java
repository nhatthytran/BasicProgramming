/**
 * 
 */
package exe5.exe5_9;

import exe5.exe5_5.ConsLog;

/**
 * @author nhatthy
 * 
 * ConsGrades: first, rest
 */
public class ConsGrades implements IGrades {
	private GradeRecord first;
	private IGrades rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsGrades(GradeRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	* @return
	*/
	@Override
	public String toString() {
		return this.first + "\n" + this.rest;
	}
	/**
	* @param obj
	* @return
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsGrades))
			return false;
		else {
			ConsGrades that = (ConsGrades) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	@Override
	public int howManyCredits() {
		return this.first.howManyCredits()+this.rest.howManyCredits();
	}
	@Override
	public double gradeAverage() {
		return (this.first.gradeTotal() + this.rest.gradeAverage())/this.howManyCredits();
	}
	@Override
	public IGrades sortByGradeDec() {
		// TODO Auto-generated method stub
		return this.rest.sortByGradeDec().insertInGradeOrder(this.first);
	}
	@Override
	public IGrades greaterThanList(double gradeOver) {
		if(this.first.checkOver(gradeOver))
			return new ConsGrades(this.first, this.rest.greaterThanList(gradeOver));
		return this.rest.greaterThanList(gradeOver);
	}
	@Override
	public IGrades insertInGradeOrder(GradeRecord g) {
		if(g.hasGradeBiggerThan(this.first))
			return new ConsGrades(g, this);
		else
			return new ConsGrades(this.first, this.rest.insertInGradeOrder(g));
	}
	
	
}
