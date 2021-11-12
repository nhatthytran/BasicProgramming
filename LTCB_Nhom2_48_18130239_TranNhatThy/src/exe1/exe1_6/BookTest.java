package exe1.exe1_6;

import junit.framework.TestCase;

public class BookTest extends TestCase{
	public void testAuthorConstructor() {
		new Author("Daniel Defoe", 1889);
		new Author("Joseph Conrad", 1890);
		new Author("Pat Conroy", 1995);
	}
	public void testBookConstructor(){
		new Book("Robinson Crusoe",15.50,1719, new Author("Daniel Defoe", 1889));
		new Book("Heart of Darkness", 12.80, 1902, new Author("Joseph Conrad", 1890));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", 1995));
	}

}
