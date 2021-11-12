package exe1.exe1_3;

import junit.framework.TestCase;

public class AutomobileTest extends TestCase{
	
	public void testConstructor() {
		new Automobile("Genesis", 35450, 400, true);
		new Automobile("Tesla", 39990, 330, false);
	}

}
