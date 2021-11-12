package exe1.exe1_4;

import junit.framework.TestCase;

public class TimePointTest extends TestCase{
	
	public void testConstructor() {
		new TimePoint(0, 0, 0);
		new TimePoint(4,12,59);
	}

}
