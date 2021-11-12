package exe4.exe4_7;
/*
 * ITaxiVehicle: dai dien cho Cab, Limo, Van
 */
public interface ITaxiVehicle {
	
	/*
	 * 1. computes the fare for a vehicle, based on the number of miles traveled, and using the following formulas for different vehicles: 
	 * - passengers in a cab just pay flat fee per mile 
	 * - passengers in a limo must pay at least the minimum rental fee, otherwise they pay by the mile 
	 * - passengers in a van pay $1.00 extra for each passenger
	 */
	public double fare();
	// 2. determines whether the fare for a given number of miles is lower than some amount
	public boolean lowerPrice(double amount);
	// 3. determines whether the fare in one vehicle is lower than the fare in another vehicle for the same number of miles
	public boolean cheaperThan(ITaxiVehicle that);

}
