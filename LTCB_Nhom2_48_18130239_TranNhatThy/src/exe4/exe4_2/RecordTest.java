package exe4.exe4_2;

import junit.framework.TestCase;

public class RecordTest extends TestCase{

	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Image
		IRecord image = new Image("flower.gif", 57234, 50, 100, "medium");
		
		// test for Text
		IRecord text = new Text("welcome.txt", 5312, 830);
		
		// test for Sound
		IRecord sound = new Sound("theme.mp3", 40960, 3*60+20);
	}
	
}
