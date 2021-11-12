package shape.unions;
/*
 * Dot: dinh nghia 1 diem. Gom:
 * 	vi tri (loc)
 */
public class Dot extends AShape{

	public Dot(CartPt loc) {
		super(loc);
	}
	// 1. dien tich cua Dot() = 0
	@Override
	public double area() {
		return 0;
	}

	// 2. Dot co chua point khi 2 diem trung nhau
	@Override
	public boolean contains(CartPt point) {
		return this.loc.equals(point);
	}
	// 3. hinh vuong bao quanh Dot co kich thuoc bang 0
	@Override
	public Square boundingBox() {
		return new Square(loc, 0);
	}
	@Override
	public double perimeter() {
		return 0;
	}

	
}
