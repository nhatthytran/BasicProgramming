package exe4.exe4_3;

public class VehicleTest {
	/*
	 * test for constructor
	 */
	public void testConstructor() {
		// test for Bus
		IVehicle bus = new Bus("51B-4242", 200.0, 15);
		
		// test for Limo
		IVehicle limo = new Limo("48N-2456", 250.0, "white");
		
		// test for Car
		IVehicle car = new Car("47H-4521", 150.0);
		
		// test for Subway
		IVehicle subway = new Subway("21-124",500.0,2456);
	}

}
