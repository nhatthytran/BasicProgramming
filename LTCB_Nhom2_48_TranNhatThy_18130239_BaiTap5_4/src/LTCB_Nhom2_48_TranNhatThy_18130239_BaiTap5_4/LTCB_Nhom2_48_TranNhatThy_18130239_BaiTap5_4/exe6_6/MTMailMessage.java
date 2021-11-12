/**
 * 
 */
package exe6_6;

/**
 * @author nhatthy
 *
 */
public class MTMailMessage implements IMailMessages {

	public MTMailMessage() {
	}

	@Override
	public IMailMessages sortByDate() {
		return new MTMailMessage();
	}

	@Override
	public IMailMessages insertInDateOrder(Mail m) {
		return new ConsMailMessages(m, new MTMailMessage());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTMailMessage))
			return false;
		return true;
	}
	
	
	
}
