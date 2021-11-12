package exe4.exe4_4;
/*
 * Dot: dinh nghia 1 diem. Gom:
 * 	vi tri (loc)
 */
public class Dot extends AShape{

	public Dot(CartPt loc) {
		super();
		this.loc = loc;
	}
	// 1. dien tich cua Dot() = 0
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	// 2. Dot co chua point khi 2 diem trung nhau
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		return this.loc.sameLocation(point);
	}
	// 3. hinh vuong bao quanh Dot co kich thuoc bang 0
	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(loc, 0);
	}
	@Override
	public double perimeter() {
		return 0;
	}

	
}
