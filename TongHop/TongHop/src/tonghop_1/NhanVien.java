package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:42 PM
 */
public abstract class NhanVien {

	protected double luong;
	protected String maSo;
	protected String ten;
	protected ITinhTienThuongStrategy tinhTienThuong;

	public NhanVien(){
		super();
	}

	public NhanVien(double luong, String maSo, String ten) {
		super();
		this.luong = luong;
		this.maSo = maSo;
		this.ten = ten;
	}

	public double getLuong() {
		return luong;
	}

	public String getMaSo() {
		return maSo;
	}

	public String getTen() {
		return ten;
	}

	public ITinhTienThuongStrategy getTinhTienThuong() {
		return tinhTienThuong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setTinhTienThuong(ITinhTienThuongStrategy tinhTienThuong) {
		this.tinhTienThuong = tinhTienThuong;
	}

	public abstract String getThongTin();
	public void tinhTienThuong() {
		System.out.printf("Tiền thưởng %10.0f",tinhTienThuong.tinhTienThuong(this.luong));
	}
}//end NhanVien