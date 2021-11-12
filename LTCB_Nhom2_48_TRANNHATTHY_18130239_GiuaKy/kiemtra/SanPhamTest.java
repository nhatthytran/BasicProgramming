package kiemtra;

import junit.framework.TestCase;

public class SanPhamTest extends TestCase{

	/*
	 * 2. test constructor
	 * vd: SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021))
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021))
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021))
	 */
	public void testConstructor() {
		new SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021));
		new SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021));
		new SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021));
	}
	/*
	 * 3. test laTiviHoacTulanh
	 * xac dinh sp co phai "Ti vi" / "Tu lanh" k?
	 * vd: SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021)) => true
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021)) => true
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021)) => false
	 */
	public void testLaTiviHoacTulanh() {
		SanPham s1 = new SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021));
		SanPham s2 = new SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021));
		SanPham s3 = new SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021));
		assertTrue(s1.laTiviHoacTulanh());
		assertTrue(s2.laTiviHoacTulanh());
		assertFalse(s3.laTiviHoacTulanh());
	}
	/*
	 * 4. test tinh the tich san pham = dai * rong * cao => viet ham tinh the tich trong KichThuoc
	 * vd: SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021)) => 15.0
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021)) => 2000.0
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021)) => 20.0
	 */
	public void testTheTichSanPham() {
		SanPham s1 = new SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021));
		SanPham s2 = new SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021));
		SanPham s3 = new SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021));
		assertEquals(s1.theTichSanPham(), 15.0, 0.001);
		assertEquals(s2.theTichSanPham(), 2000.0, 0.001);
		assertEquals(s3.theTichSanPham(), 20.0, 0.001);
	}
	/*
	 * 5. cho 1 ngay, xac nhan san pham co phai nhap kho vao ngay do khong?
	 * vd: cho Ngay(22,3,2021)
	 * 		SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021)) => true
	 * 		SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021)) => false
	 * 		SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021)) => false
	 */
	public void testKiemNgayNhapKho() {
		Ngay ngay = new Ngay(22,3,2021);
		SanPham s1 = new SanPham("Ti vi", new KichThuoc(5.0,3.0,1.0), 5.0, 5500.0, new Ngay(22,3,2021));
		SanPham s2 = new SanPham("Tu lanh", new KichThuoc(10.0,10.0,20.0), 25.0, 10000.0, new Ngay(24,7,2021));
		SanPham s3 = new SanPham("May lanh", new KichThuoc(5.0,2.0,2.0), 6.0, 3000.0, new Ngay(29,7,2021));
		assertTrue(s1.kiemNgayNhapKho(ngay));
		assertFalse(s2.kiemNgayNhapKho(ngay));
		assertFalse(s3.kiemNgayNhapKho(ngay));
	}
	/*
	 * 6. test Tinh phi van chuyen san pham biet rang:
	 * 	- neu trongLuong <=5 && theTichSanPham() < 1m3 => dongia*0.005
	 *	- neu trongLuong >5 && theTichSanPham() < 1m3 => dongia*0.01
	 *	- con lai dongia * 0.0015 
	 *	vd: SanPham("Ti vi", new KichThuoc(0.73,0.46, 0.15), 5.0, 5500.0, new Ngay(22,3,2021)) => 27.5
	 * 		SanPham("Tu lanh", new KichThuoc(0.49, 0.47, 0.8), 25.0, 10000.0, new Ngay(24,7,2021)) => 10.0
	 * 		SanPham("May lanh", new KichThuoc(2.0, 1.0, 1.0), 6.0, 3000.0, new Ngay(29,7,2021)) => 4.5
	 */
	public void testPhiVanChuyen() {
		SanPham s1 = new SanPham("Ti vi", new KichThuoc(0.73,0.46, 0.15), 5.0, 5500.0, new Ngay(22,3,2021));
		SanPham s2 = new SanPham("Tu lanh", new KichThuoc(0.49, 0.47, 0.8), 25.0, 10000.0, new Ngay(24,7,2021));
		SanPham s3 = new SanPham("May lanh", new KichThuoc(2.0, 1.0, 1.0), 6.0, 3000.0, new Ngay(29,7,2021));
		assertEquals(s1.phiVanChuyen(), 27.5, 0.001);
		assertEquals(s2.phiVanChuyen(), 10.0, 0.001);
		assertEquals(s3.phiVanChuyen(), 4.5, 0.001);
	}
}
