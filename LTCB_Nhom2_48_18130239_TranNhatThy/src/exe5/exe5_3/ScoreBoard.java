/**
 * 
 */
package exe5.exe5_3;

/**
 * @author nhatthy
 * 
 * ScoreBoard: name, class, grades
 */
public class ScoreBoard {
	private String name;
	private String className;
	private IGrades grades;
	/**
	 * 
	 * @param name
	 * @param className
	 * @param grades
	 */
	public ScoreBoard(String name, String className, IGrades grades) {
		super();
		this.name = name;
		this.className = className;
		this.grades = grades;
	}

}
