/**
 * 
 */
package exe5.exe5_13;

/**
 * @author nhatthy
 *
 */
public interface IListBook {

	/**
	 * Develop the method thisAuthor, which produces the
	 * list of books that this author has authored.
	 * @param author
	 * @return 
	 */
	public IListBook thisAuthor(String author);
	/**
	 * 
	 * @return
	 */
	public IListBook sortByTitle();
	/**
	 * Insert ABook into a List which is sorted
	 * @param book
	 * @return
	 */
	public IListBook insertBookByOrderTitle(ABook book);
	/**
	 * Get a list of Books which have price that is max.
	 * @return
	 */
	public IListBook getMaxPriceBooks();
	/**
	 * Get price is max
	 * @return
	 */
	public double getMaxPriceBook();
	public IListBook getListBooks(double mprice);
	
}
