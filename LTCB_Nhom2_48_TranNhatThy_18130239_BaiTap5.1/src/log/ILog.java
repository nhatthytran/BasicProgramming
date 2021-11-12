package log;

public interface ILog {

	/**
	 * 
	 * @return the total number of miles run
	 */
	public double miles();
	/**
	 * 
	 * @param month: thang
	 * @param year: nam
	 * @return those entries in this.log for the given month and year
	 */
	public ILog getLogs(int month, int year);
	/**
	 * 
	 * @param month: thang
	 * @param year: nam
	 * @return total distance run in a given month
	 */
	public double milesInMonth(int month, int year);
	/**
	 * 
	 * @return the maximum distance ever run
	 */
	public double maxDistance();
	/**
	 * 
	 * @return
	 */
	public ILog sortByDistance();
	/**
	 * 
	 * @param e
	 * @return
	 */
	public ILog insertInDistanceOrder(Entry e);
	/**
	 * Thuc hien lay ra 1 ds cac entry theo 1 cam giac cho truoc
	 * Input: 
	 *  - this(ds entry)
	 *  - @param:comment(camgiac - string)
	 * Output:
	 *  @return ds cac entry theo cam giac
	 * 
	 */
	public ILog getLogByComment(String comment);
//	public double getMaxDistance();
}
