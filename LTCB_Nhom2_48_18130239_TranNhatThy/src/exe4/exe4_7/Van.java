package exe4.exe4_7;
/*
 * Van: dinh nghia xe tai. gom:
 * 	- access
 */
public class Van extends ATaxiVehicle{
	private boolean access;
	public Van(int idNum, int passengers, int pricePerMile, boolean access) {
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
		this.access = access;
	}
	// 1. override fare of van
	@Override
	public double fare() {
		return this.passengers*(this.pricePerMile+1);
	}
}
