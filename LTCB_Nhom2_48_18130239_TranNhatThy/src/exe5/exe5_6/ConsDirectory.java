/**
 * 
 */
package exe5.exe5_6;

/**
 * @author nhatthy
 *
 */
public class ConsDirectory implements IDirectory {
	private PhoneRecord first;
	private IDirectory rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsDirectory(PhoneRecord first, IDirectory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * @param directory: so dien thoai hoac danh ba
	 * return ten cua so hoac danh ba do
	 */
	@Override
	public String whoseNumber(String number) {
		return this.first.whoseNumber(number) + this.rest.whoseNumber(number);
	}
	@Override
	public String phoneNumber(String name) {
		// TODO Auto-generated method stub
		return this.first.phoneNumber(name) + this.rest.phoneNumber(name);
	}
	

}
