package zoom;
/*
 * Lion: dinh nghia con su tu. Gom:
 * 	ten (name)
 * 	can nang (weight)
 * 	luong thit an moi ngay (meatEat)
 */
public class Lion implements IAnimal {
	private String name;
	private double weight;
	private double meatEat;
	public Lion(String name, double weight, double meatEat) {
		this.name = name;
		this.weight = weight;
		this.meatEat = meatEat;
	}
}
