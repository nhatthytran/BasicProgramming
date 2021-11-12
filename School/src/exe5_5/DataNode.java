/**
 * 
 */
package exe5_5;

/**
 * @author nhatthy
 *
 */
public class DataNode extends ATree{
	private Person person;
	private ATree father;
	private ATree mother;
	public DataNode(Person person, ATree father, ATree mother) {
		super();
		this.person = person;
		this.father = father;
		this.mother = mother;
	}
	
}
