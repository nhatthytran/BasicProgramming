package ex3_restaurant;

public class MTRestaurant implements IRestaurant {
	// to string
	public String toString() {
		return "";
	}

	// equal
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTRestaurant))
			return false;
		return true;
	}

}
