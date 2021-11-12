/**
 * 
 */
package exe5.exe5_11;

/**
 * @author nhatthy
 *
 */
public class Mail {
	private String from;
	private Date date;
	private String message;
	
	/**
	 * 
	 * @param from: nguoi gui
	 * @param date: ngay gui
	 * @param message: tin nhan
	 */
	public Mail(String from, Date date, String message) {
		super();
		this.from = from;
		this.date = date;
		this.message = message;
	}

	public boolean hasDateNearThan(Mail mail) {
		return this.date.hasNearThan(mail.date);
	}
	@Override
	public String toString() {
		return "From: " + this.from + ". Ngay: " + this.date + ". Message: " + this.message;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Mail))
			return false;
		else {
			Mail that = (Mail) obj;
			return this.from.equals(that.from)
					&& this.date.equals(that.date)
					&& this.message.equals(that.message);
		}
	}
	
	
}
