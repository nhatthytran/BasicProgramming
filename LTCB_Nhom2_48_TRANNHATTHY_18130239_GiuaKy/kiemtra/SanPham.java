package kiemtra;

public class SanPham {
	/*
	 * can tao them 2 class KichThuoc va Ngay
	 */
	private String name;
	private KichThuoc kichThuoc;
	private double trongLuong;
	private double donGia;
	private Ngay ngayNhapKho;
	/* 2.
	 * vd: SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021))
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021))
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021))
	 */
	public SanPham(String name, KichThuoc kichThuoc, double trongLuong, double donGia, Ngay ngayNhapKho) {
		this.name = name;
		this.kichThuoc = kichThuoc;
		this.trongLuong = trongLuong;
		this.donGia = donGia;
		this.ngayNhapKho = ngayNhapKho;
	}
	/*
	 * 3. xac dinh sp co phai "Ti vi" / "Tu lanh" k?
	 * vd: SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021)) => true
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021)) => true
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021)) => false
	 */
	public boolean laTiviHoacTulanh() {
		return this.name == "Ti vi" | this.name == "Tu lanh";
	}
	/*
	 * 4. tinh the tich san pham = dai * rong * cao => viet ham tinh the tich trong KichThuoc
	 * vd: SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021)) => 15.0
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021)) => 2000.0
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021)) => 20.0
	 */
	public double theTichSanPham() {
		return this.kichThuoc.theTich();
	}
	/*
	 * 5. cho 1 ngay, xac nhan san pham co phai nhap kho vao ngay do khong?
	 * vd: cho Ngay(22,3,2021)
	 * 		SanPham("Ti vi", new KichThuoc(0.73,0.46, 0.15), 5.0, 5500.0, new Ngay(22,3,2021)) => true
	 * 		SanPham("Tu lanh", new KichThuoc(0.49, 0.47, 0.8), 25.0, 10000.0, new Ngay(24,7,2021)) => false
	 * 		SanPham("May lanh", new KichThuoc(0.77, 0.2, 0.2), 6.0, 3000.0, new Ngay(29,7,2021)) => false
	 */
	public boolean kiemNgayNhapKho(Ngay ngayKiem) {
		return this.ngayNhapKho.soSanh(ngayKiem);
	}
	/*
	 * 6. Tinh phi van chuyen san pham biet rang:
	 * 	- neu trongLuong <=5 && theTichSanPham() < 1m3 => dongia*0.005
	 *	- neu trongLuong >5 && theTichSanPham() < 1m3 => dongia*0.01
	 *	- con lai dongia * 0.0015 
	 *	vd: SanPham("Ti vi", new KichThuoc(0.73,0.46, 0.15), 5.0, 5500.0, new Ngay(22,3,2021)) => 27.5
	 * 		SanPham("Tu lanh", new KichThuoc(0.49, 0.47, 0.8), 25.0, 10000.0, new Ngay(24,7,2021)) => 10.0
	 * 		SanPham("May lanh", new KichThuoc(2.0, 1.0, 1.0), 6.0, 3000.0, new Ngay(29,7,2021)) => 4.5
	 */
	public double phiVanChuyen() {
		if(this.trongLuong <= 5.0 && this.theTichSanPham() < 1.0) {
			return this.donGia*0.005;
		} else if(this.trongLuong > 5.0 && this.theTichSanPham() < 1.0) {
			return this.donGia*0.001;
		} else
			return this.donGia*0.0015;
	}
	
}
