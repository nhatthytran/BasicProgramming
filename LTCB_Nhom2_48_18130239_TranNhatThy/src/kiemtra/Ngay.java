package kiemtra;

public class Ngay {
	/*
	 * gom ngay, thang, nam
	 */
	private int ngay;
	private int thang;
	private int nam;
	public Ngay(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	/*
	 * getter va setter
	 */
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	/*
	 * 5. so sanh 2 ngay co giong nhau k
	 */
	public boolean soSanh(Ngay ngayKiem) {
		return this.ngay==ngayKiem.getNgay()
				&& this.thang==ngayKiem.getThang()
				&& this.nam==ngayKiem.getNam();
	}
	
	
}
