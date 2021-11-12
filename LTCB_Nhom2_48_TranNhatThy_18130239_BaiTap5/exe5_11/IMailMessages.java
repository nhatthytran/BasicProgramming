/**
 * 
 */
package exe5.exe5_11;

/**
 * @author nhatthy
 *
 */
public interface IMailMessages {
	/**
	 * Thuc hien lay danh sach Mail bang ngay
	 * @return danh sach Mail da duoc sap xep
	 */
	public IMailMessages sortByDate();
	/**
	 * 
	 * @param m: mail
	 * @return danh sach them vao
	 */
	public IMailMessages insertInDateOrder(Mail m);
}
