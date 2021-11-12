package coffee;

public class CoffeeExample {
	public static void main(String[] args) {
		Coffee coffee = new Coffee("Hawainian Kona", 15.95, 100);
		System.out.println(coffee.cost());
	}
}
