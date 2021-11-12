package exe1.exe1_7;

import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase{
	public void testDateConstructor() {
		new Date(12, 4, 2021);
		new Date(27, 11, 2021);
		new Date(5, 12, 2021);
	}
	public void testTemperatureRangeConstructor() {
		new TemperatureRange(23, 29);
		new TemperatureRange(24, 29);
		new TemperatureRange(25, 30);
	}
	
	public void testWeatherRecordConstructor() {
		new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 8.0);
		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 9.0);
		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 12.0);
	}
}
