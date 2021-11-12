package exe5_3;

import junit.framework.TestCase;

public class RiverTest extends TestCase{

	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Mouth
		ARiver mouth = new Mouth(new Location(7, 5, "m"), 30, new ARiver(new Location(5, 5, "a"), 30));
		
		// test for Source
		ARiver source = new Source(new Location(1, 5, "t"), 50);
		
		// test for Confluence
		ARiver confluence = new Confluence(new Location(3, 3, "b"), 60, source, mouth);
	}
}
