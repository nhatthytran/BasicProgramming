package exe4.exe4_3;
/*
 * Subway: dinh nghia tau dien ngam. Gom
 * 	bien so xe (licensePlates)
 * 	can nang (weight)
 * 	luong dien tieu thu (amountOfElectricity)
 */
public class Subway extends AVehicle{
	private double amountOfElectricity;
	public Subway(String licensePlates, double weight, double amountOfElectricity) {
		super();
		this.licensePlates = licensePlates;
		this.weight = weight;
		this.amountOfElectricity = amountOfElectricity;
	}
}
