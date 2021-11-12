/**
 * 
 */
package exe5.exe5_9;

/**
 * @author nhatthy
 *
 *	GradeRecord: course, grade
 */
public class GradeRecord {
	private Course course;
	private double grade;
	
	/**
	 * 
	 * @param course
	 * @param grade
	 */
	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}

	
	@Override
	public String toString() {
		return "GradeRecord [course=" + course + ", grade=" + grade + "]";
	}
	
	/**
	* @param obj
	* @return
	*/
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof GradeRecord))
			return false;
		else {
			GradeRecord that = (GradeRecord) obj;
			return this.course.equals(that.course)
					&& this.grade == that.grade;
		}
	}


	public int howManyCredits() {
		return this.course.getCredits();
	}


	public double gradeTotal() {
		return this.grade * this.course.getCredits();
	}


	public boolean hasGradeBiggerThan(GradeRecord first) {
		// TODO Auto-generated method stub
		return this.grade>=first.grade;
	}


	public boolean checkOver(double gradeOver) {
		// TODO Auto-generated method stub
		return this.grade>gradeOver;
	}
	
	
	
	
}
