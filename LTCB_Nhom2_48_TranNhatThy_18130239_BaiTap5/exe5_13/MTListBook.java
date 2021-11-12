/**
 * 
 */
package exe5.exe5_13;

/**
 * @author nhatthy
 *
 */
public class MTListBook implements IListBook{
	public MTListBook() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IListBook thisAuthor(String author) {
		// TODO Auto-generated method stub
		return new MTListBook();
	}

	@Override
	public IListBook sortByTitle() {
		return new MTListBook();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTListBook))
			return false;
		return true;
	}

	@Override
	public IListBook insertBookByOrderTitle(ABook book) {
		// TODO Auto-generated method stub
		return new ConsListBook(book, new MTListBook());
	}

	@Override
	public IListBook getMaxPriceBooks() {
		// TODO Auto-generated method stub
		return new MTListBook();
	}

	@Override
	public double getMaxPriceBook() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IListBook getListBooks(double mprice) {
		// TODO Auto-generated method stub
		return new MTListBook();
	}
}
