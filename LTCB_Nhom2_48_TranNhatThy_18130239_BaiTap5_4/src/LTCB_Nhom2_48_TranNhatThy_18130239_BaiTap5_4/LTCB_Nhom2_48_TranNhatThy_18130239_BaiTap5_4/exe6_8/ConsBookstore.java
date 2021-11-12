/**
 * 
 */
package exe6_8;


/**
 * @author nhatthy
 *
 */
public class ConsBookstore implements IBookstore {
	private ABook first;
	private IBookstore rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsBookstore(ABook first, IBookstore rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public IBookstore thisAuthor(String author) {
		if(this.first.checkAuthor(author))
			return new ConsBookstore(this.first,this.rest.thisAuthor(author));
		return this.thisAuthor(author);
	}
	
	
}
