package exe4.exe4_7;

/*
 * Limo: dinh nghia xe limo. gom:
 * 	- minRental
 */
public class Limo extends ATaxiVehicle {
	private int minRental;

	public Limo(int idNum, int passengers, int pricePerMile, int minRental) {
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
		this.minRental = minRental;
	}

	// 1. Override fare of limo
	@Override
	public double fare() {
		if (this.passengers * this.pricePerMile < this.minRental) {
			return this.minRental;
		} else
			return this.passengers * this.pricePerMile;
	}
}
