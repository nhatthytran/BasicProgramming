/**
 * 
 */
package exe5.exe5_9;

/**
 * @author nhatthy
 *
 */
public interface IGrades {
	/**
	 * Tinh tong so tin chi trong bang diem ma sinh vien da dat duoc
	 * @return 
	 */
	public int howManyCredits();
	/**
	 * Tinh diem trung binh cua sinh vien bang tong tich cua diem 
	 * so tung mon voi so tin chi chia cho tong so tin chi
	 * @return
	 */
	public double gradeAverage();
	/**
	 * Sap xep bang diem so cua sinh vien theo thu tu diem giam dan
	 * @return
	 */
	public IGrades sortByGradeDec();
	/**
	 * Danh sach diem so cua sinh vien co diem lon hon gia tri cho truoc
	 * @param gradeOver
	 * @return
	 */
	public IGrades greaterThanList(double gradeOver);
	/**
	 * 
	 * @return
	 */
	public IGrades insertInGradeOrder(GradeRecord g);
	

}
 