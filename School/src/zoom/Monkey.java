package zoom;
/*
 * Monkey: dinh nghia con khi. Gom:
 * 	ten (name)
 * 	can nang (weight)
 * 	thuc an yeu thich (favoriteFood)
 */
public class Monkey implements IAnimal {
	private String name;
	private double weight;
	private String favoriteFood;
	public Monkey(String name, double weight, String favoriteFood) {
		this.name = name;
		this.weight = weight;
		this.favoriteFood = favoriteFood;
	}
	
}
