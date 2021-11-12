package exe3.exe3_2;

public class Author {
	private String name;
	private int yearBirth;
	public Author(String name, int yearBirth) {
		super();
		this.name = name;
		this.yearBirth = yearBirth;
	}

	/*
	 * Getter and setter
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearBirth() {
		return yearBirth;
	}
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	/*
	 * 2. checkAuthorYearBirth()
	 * kiem tra tac do co sinh sau nam 1940 k
	 */
	public boolean checkAuthorYearBirth() {
		return this.yearBirth > 1940;
	}
	/*
	 * 3. xac dinh 2 tac gia co giong
	 */
}
