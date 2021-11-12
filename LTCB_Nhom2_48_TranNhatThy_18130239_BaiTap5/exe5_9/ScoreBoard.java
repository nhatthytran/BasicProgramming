/**
 * 
 */
package exe5.exe5_9;

/**
 * @author nhatthy
 * 
 * ScoreBoard: name, class, grades
 */
public class ScoreBoard {
	private String name;
	private String className;
	private IGrades grades;
	/**
	 * 
	 * @param name
	 * @param className
	 * @param grades
	 */
	public ScoreBoard(String name, String className, IGrades grades) {
		super();
		this.name = name;
		this.className = className;
		this.grades = grades;
	}

	/**
	 * Tinh tong so tin chi trong bang diem ma sinh vien da dat duoc
	 * @return 
	 */
	public int howManyCredits() {
		return this.grades.howManyCredits();
	}
	/**
	 * Tinh diem trung binh cua sinh vien bang tong tich cua diem 
	 * so tung mon voi so tin chi chia cho tong so tin chi
	 * @return
	 */
	public double gradeAverage() {
		return this.grades.gradeAverage();
	}
	/**
	 * Sap xep bang diem so cua sinh vien theo thu tu diem giam dan
	 * @return
	 */
	public IGrades sortByGradeDec() {
		return this.grades.sortByGradeDec();
	}
	/**
	 * Danh sach diem so cua sinh vien co diem lon hon gia tri cho truoc
	 * @param gradeOver
	 * @return
	 */
	public IGrades greaterThanList(double gradeOver) {
		return this.grades.greaterThanList(gradeOver);
	}
}
