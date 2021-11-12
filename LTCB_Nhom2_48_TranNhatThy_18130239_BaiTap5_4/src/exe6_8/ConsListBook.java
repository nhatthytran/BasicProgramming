/**
 * 
 */
package exe6_8;


/**
 * @author nhatthy
 *
 */
public class ConsListBook implements IListBook {
	private ABook first;
	private IListBook rest;
	/**
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsListBook(ABook first, IListBook rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public IListBook thisAuthor(String author) {
		if(this.first.checkAuthor(author))
			return new ConsListBook(this.first,this.rest.thisAuthor(author));
		return this.thisAuthor(author);
	}
	@Override
	public IListBook sortByTitle() {
		// TODO Auto-generated method stub
		return this.rest.insertBookByOrderTitle(this.first);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsListBook))
			return false;
		else {
			ConsListBook that = (ConsListBook) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	@Override
	public IListBook insertBookByOrderTitle(ABook book) {
		if(book.smallThatByTitle(this.first))
			return new ConsListBook(book, this);
		else
			return new ConsListBook(this.first, this.rest.insertBookByOrderTitle(book));
	}
	@Override
	public IListBook getMaxPriceBooks() {
		double mprice = this.getMaxPriceBook();
		return this.getListBooks(mprice);
	}
	@Override
	public double getMaxPriceBook() {
		double p = this.rest.getMaxPriceBook();
		if(this.first.cheaperPriceThan(p))
			return p;
		else
			return this.first.getPrice();
	}
	public IListBook getListBooks(double mprice) {
		if(this.first.checkPrice(mprice))
			return new ConsListBook(this.first, this.rest.getListBooks(mprice));
		else
			return this.rest.getListBooks(mprice);
	}
	
	
}
