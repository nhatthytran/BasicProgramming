package exe4.exe4_3;
/*
 * Bus: dinh nghia xe buyt. Gom:
 * 	bien so xe (licensePlates)
 * 	can nang (weight)
 * 	so tram (stationNumber)
 */
public class Bus extends AVehicle{
	int stationNumber;
	public Bus(String licensePlates, double weight, int stationNumber) {
		super();
		this.licensePlates = licensePlates;
		this.weight = weight;
		this.stationNumber = stationNumber;
	}
	
}
