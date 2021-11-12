package exe4.exe4_5;

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
	/*
	 * test for timeToDownload
	 * speed = 250
	 */
	public void testTimeToDownload() {
		// test for Image => 228.936
		IRecord image = new Image("flower.gif", 57234, 50, 100, "medium");
		assertEquals(image.timeToDownload(250), 57234/250, 0.001);
		
		// test for Text => 21.248
		IRecord text = new Text("welcome.txt", 5312, 830);
		assertEquals(text.timeToDownload(250), 5312/250, 0.001);
		
		// test for Sound => 163.84
		IRecord sound = new Sound("theme.mp3", 40960, 3*60+20);
		assertEquals(sound.timeToDownload(250), 40960/250, 0.001);
	}
	/*
	 * test for smallerThan
	 * maximum size = 50000
	 */
	public void testSmallerThan() {
		// test for Image => false
		IRecord image = new Image("flower.gif", 57234, 50, 100, "medium");
		assertFalse(image.smallerThan(50000));
		
		// test for Text => true
		IRecord text = new Text("welcome.txt", 5312, 830);
		assertTrue(text.smallerThan(50000));
		
		// test for Sound => true
		IRecord sound = new Sound("theme.mp3", 40960, 3*60+20);
		assertTrue(sound.smallerThan(50000));
	}
	/*
	 * test for sameName
	 * name = "flower.gif"
	 */
	public void testSameName() {
		// test for Image => true
		IRecord image = new Image("flower.gif", 57234, 50, 100, "medium");
		assertTrue(image.sameName("flower.gif"));
		
		// test for Text => false
		IRecord text = new Text("welcome.txt", 5312, 830);
		assertFalse(text.sameName("flower.gif"));
		
		// test for Sound => false
		IRecord sound = new Sound("theme.mp3", 40960, 3*60+20);
		assertFalse(sound.sameName("flower.gif"));
	}
	
}
