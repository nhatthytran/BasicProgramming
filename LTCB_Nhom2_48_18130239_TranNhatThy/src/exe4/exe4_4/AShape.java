package exe4.exe4_4;
/*
 * AShape: lop cha cua cac hinh. Gom 1 thuoc tinh chung:
 * 	vi tri (loc)
 */
public abstract class AShape implements IShape{
	protected CartPt loc;
	// 1. tinh dien tich cua moi hinh
	public abstract double area();

	// 2. tinh khoang cach cua hinh den goc toa do
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return this.loc.distanceToO();
	}
	
	// 3. kiem tra 1 diem co nam trong hinh do k
	public abstract boolean contains(CartPt point);
	
	// 4. tinh hinh vuong bao quanh hinh
	public abstract Square boundingBox();
	
	// 5. chu vi cac hinh
	public abstract double perimeter();

	public CartPt getLoc() {
		return loc;
	}

	public void setLoc(CartPt loc) {
		this.loc = loc;
	}
	

}
