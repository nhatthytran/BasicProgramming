package exe1.exe1_1;

import junit.framework.*;

public class BookTest extends TestCase{

	public void testConstructor() {
		new Book("Robinson Crusoe", 15.50, 1719, "Daniel Defoe");
		new Book("Heart of Darkness", 12.80, 1902, "Joseph Conrad");
		new Book("Beach Music", 9.50, 1996, "Pat Conroy");
	}
	
}
