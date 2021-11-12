package exe4.exe4_3;
/*
 * Limo: dinh nghia xe limo. Gom:
 * 	bien so xe (licensePlates)
 * 	can nang (weight)
 * 	mau xe (color)
 */
public class Limo extends AVehicle{
	private String color;
	public Limo(String licensePlates, double weight, String color) {
		super();
		this.licensePlates = licensePlates;
		this.weight = weight;
		this.color = color;
	}

}
