/**
 * 
 */
package exe5.exe5_11;

/**
 * @author nhatthy
 *
 */
public class ConsMailMessages implements IMailMessages {
	private Mail first;
	private IMailMessages rest;
	/**
	 * 
	 * @param first: tin nhan
	 * @param rest: phan tin nhan con lai
	 */
	public ConsMailMessages(Mail first, IMailMessages rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public IMailMessages sortByDate() {
		return this.rest.sortByDate().insertInDateOrder(this.first);
	}
	@Override
	public IMailMessages insertInDateOrder(Mail m) {
		if(m.hasDateNearThan(this.first))
			return new ConsMailMessages(m, this);
		else{
			return new ConsMailMessages(this.first, this.rest.insertInDateOrder(m));
		}
	}
	@Override
	public String toString() {
		return this.first + "\n" + this.rest;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsMailMessages))
			return false;
		else {
			ConsMailMessages that = (ConsMailMessages) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	
}
