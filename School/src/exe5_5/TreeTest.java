/**
 * 
 */
package exe5_5;

import junit.framework.TestCase;

/**
 * @author nhatthy
 *
 */
public class TreeTest extends TestCase{
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Person
		Person peter = new Person("Peter", 1980);
		Person janet = new Person("Janet", 1958);
		Person paul = new Person("Paul", 1956);
		
		// test for ATree
		ATree empty = new MTNode();
		
		ATree mother = new DataNode(janet, empty, empty);
		ATree father = new DataNode(paul, empty, empty);
		ATree son = new DataNode(peter, father, mother);
	}
}
