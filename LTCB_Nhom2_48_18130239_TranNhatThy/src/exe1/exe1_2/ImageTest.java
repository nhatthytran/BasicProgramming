package exe1.exe1_2;

import junit.framework.TestCase;

public class ImageTest extends TestCase{
	
	public void testConstructor() {
		new Image(5, 10, "small.gif", "low");
		new Image(120, 1000, "large.gif", "low");
		new Image(1200, 1000, "large.gif", "high");
	}

}
