package exe3.exe3_3;

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
	/*
	 * 1. which determines whether today's high and low were within the normal range
	 * vd: new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 8.0); => true
	 *		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 9.0); => false
	 *		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 12.0); => false
	 */
	public void testWithinRange() {
		WeatherRecord w1 = new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 8.0);
		WeatherRecord w2 = new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 9.0);
		WeatherRecord w3 = new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 12.0);
		assertTrue(w1.withinRange());
		assertFalse(w2.withinRange());
		assertFalse(w3.withinRange());
	}
	/*
	 * 2. which determines whether the precipitation is higher than some given value
	 * vd:	precipitation=2000 
	 * new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 3000.0); => true
	 *		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 1888.0); => false
	 *		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 925.0); => false
	 */
	public void testRainyDay() {
		WeatherRecord w1 = new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 3000.0);
		WeatherRecord w2 = new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 1888.0);
		WeatherRecord w3 = new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 925.0);
		assertTrue(w1.rainyDay(2000.0));
		assertFalse(w2.rainyDay(2000.0));
		assertFalse(w3.rainyDay(2000.0));
	}
	/*
	 * 3. determines whether the temperature today broke either the high or the low record
	 * vd: new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 3000.0); => true
	 *		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(22,30), 1888.0); => false
	 *		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(24, 31), new TemperatureRange(24, 29), new TemperatureRange(25,30), 925.0); => true
	 */
	public void testRecordDay() {
		WeatherRecord w1 = new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 3000.0);
		WeatherRecord w2 = new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(22,30), 1888.0);
		WeatherRecord w3 = new WeatherRecord(new Date(5,12,2021), new TemperatureRange(24, 31), new TemperatureRange(24, 29), new TemperatureRange(25,30), 925.0);
		assertTrue(w1.recordDay());
		assertFalse(w2.recordDay());
		assertTrue(w3.recordDay());
	}
}
