package kiemtra;

public class KichThuoc {
	/*
	 * class gom chieu dai, rong, cao
	 */
	private double dai;
	private double rong;
	private double cao;
	public KichThuoc(double dai, double rong, double cao) {
		this.dai = dai;
		this.rong = rong;
		this.cao = cao;
	}
	public double theTich() {
		// TODO Auto-generated method stub
		return this.dai * this.rong * this.cao;
	}
	
}
