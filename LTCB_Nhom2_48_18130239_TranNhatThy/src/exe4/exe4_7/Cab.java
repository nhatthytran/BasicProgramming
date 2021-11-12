package exe4.exe4_7;
/*
 * Cab: xe taxi.
 */
public class Cab extends ATaxiVehicle{
	public Cab(int idNum, int passengers, int pricePerMile) {
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}

	// Override fare of cab
	@Override
	public double fare() {
		return this.passengers*this.pricePerMile;
	}

}
