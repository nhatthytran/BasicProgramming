package exe3.exe3_3;

public class WeatherRecord {
	private Date date;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;
	public WeatherRecord(Date date, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
			double precipitation) {
		this.date = date;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
	/*
	 * 1. determines whether today's high and low were within the normal range
	 * vd: new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 8.0); => true
	 *		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 9.0); => false
	 *		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 12.0); => false
	 */
	public boolean withinRange() {
		return this.today.getLow()>this.normal.getLow()
				&& this.today.getHigh()<this.normal.getHigh();
	}
	/*
	 * 2. determines whether the precipitation is higher than some given value
	 * vd:	precipitation=2000 
	 * 		new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 3000.0); => true
	 *		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 1888.0); => false
	 *		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(25,30), 925.0); => false
	 */
	public boolean rainyDay(double precipitation) {
		return this.precipitation > precipitation;
	}
	/*
	 * 3. determines whether the temperature today broke either the high or the low record
	 * vd: new WeatherRecord(new Date(12,4,2021), new TemperatureRange(23, 29), new TemperatureRange(22, 30), new TemperatureRange(25,30), 3000.0); => true
	 *		new WeatherRecord(new Date(27,11,2021), new TemperatureRange(23, 29), new TemperatureRange(24, 29), new TemperatureRange(22,30), 1888.0); => false
	 *		new WeatherRecord(new Date(5,12,2021), new TemperatureRange(24, 31), new TemperatureRange(24, 29), new TemperatureRange(25,30), 925.0); => true
	 */
	public boolean recordDay() {
		if(this.today.getLow()<this.record.getLow() || this.today.getHigh()>this.record.getHigh()) {
			return true;
		} else 
			return false;
	}
}
