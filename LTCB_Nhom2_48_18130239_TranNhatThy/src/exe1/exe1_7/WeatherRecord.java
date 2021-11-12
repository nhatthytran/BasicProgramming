package exe1.exe1_7;

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
}
