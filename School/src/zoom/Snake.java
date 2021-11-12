package zoom;
/*
 * Snake: dinh nghia con ran. Gom:
 * 	ten (name)
 * 	can nang (weight)
 * 	do dai con ran (length)
 */
public class Snake implements IAnimal {
	private String name;
	private double weight;
	private double length;
	public Snake(String name, double weight, double length) {
		this.name = name;
		this.weight = weight;
		this.length = length;
	}
	
}
