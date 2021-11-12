/**
 * 
 */
package exe6_8;

/**
 * @author nhatthy
 *
 */
public class MTBookstore implements IBookstore{
	public MTBookstore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IBookstore thisAuthor(String author) {
		// TODO Auto-generated method stub
		return new MTBookstore();
	}
}
