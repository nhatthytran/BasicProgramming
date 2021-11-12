package phonedirectory;
/**
 * 
 * @author nhatthy
 *
 */
public interface IDirectory {
	/**
	 * 
	 * @param number
	 * @return ten cua so dien thoai hoac cua danh ba do
	 */
	public String whoseNumber(String number);
	/**
	 * 
	 * @param name: ten can kiem so dien thoai
	 * @return so dien thoai cua name
	 */
	public String phoneNumber(String name);

}
