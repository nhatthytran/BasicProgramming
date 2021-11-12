package exe5.exe5_1;

public interface ILog {
	/**
	 * 
	 * @param month: thang
	 * @param year: nam
	 * @return khoang cach chay trong thang
	 * 
	 */
	public double distance(int month, int year);
	/**
	 * 
	 * @return khoang cach lon nhat
	 */
	public double distanceMax();

}
