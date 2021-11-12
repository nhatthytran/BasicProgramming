package exe2.exe2_2;

public class MovieShow {
	double ticketPrice;
	double performanceCost;
	double serviceCost;
	public MovieShow(double ticketPrice, double performanceCost, double serviceCost) {
		this.ticketPrice = ticketPrice;
		this.performanceCost = performanceCost;
		this.serviceCost = serviceCost;
	}
	public double totalProfit(int customer) {
		return customer*this.ticketPrice - this.performanceCost - this.serviceCost*customer;
	}

}
