package exe4.exe4_7;
/*
 * ATaxiVehicle: dinh nghia lop cha cua Cab, Limo, Van. gom 3 thuoc tinh chung:
 * 	- idNum
 * 	- passengers
 * 	- pricePerMile
 */
public abstract class ATaxiVehicle implements ITaxiVehicle{
	protected int idNum;
	protected int passengers;
	protected int pricePerMile;
	// 1. computes the fare for a vehicle
	public abstract double fare();
	// 2. determines whether the fare for a given number of miles is lower than some amount
	@Override
	public boolean lowerPrice(double amount) {
		return this.fare()<amount;
	}
	// 3. determines whether the fare in one vehicle is lower than the fare in another vehicle for the same number of miles
	@Override
	public boolean cheaperThan(ITaxiVehicle that) {
		return this.fare()<that.fare();
	}
}
