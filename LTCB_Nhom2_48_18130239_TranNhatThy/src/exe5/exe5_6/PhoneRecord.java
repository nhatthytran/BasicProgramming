/**
 * 
 */
package exe5.exe5_6;

/**
 * @author nhatthy
 *
 */
public class PhoneRecord {
	private String name;
	private String phoneNumber;
	/**
	 * 
	 * @param name
	 * @param phoneNumber
	 */
	public PhoneRecord(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String whoseNumber(String number) {
		if(this.phoneNumber.equals(number))
			return this.name;
		return "";
	}
	public String phoneNumber(String name) {
		if(this.name.equals(name))
			return this.phoneNumber;
		return "";
	}
	
	
	
}
