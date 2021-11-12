/**
 * 
 */
package exe5.exe5_13;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class ABookTest extends TestCase{

	public ABookTest(String name) {
		super(name);
	}
	
	public void testConstructor() {
		ABook b1 = new Hardcover("LTCB", "T", 15, 2020);
		ABook b2 = new Sale("LTCB 1", "T1", 15, 2020);
		ABook b3 = new Paperback("LTCB 2", "T2", 15, 2020);
	}
}
