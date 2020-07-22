package tonghop_2;

public class KhachHang {
	private String maKH;
	private String hoTen;	
	private String dienThoai;
	private String diaChi;
	public String getMaKH() {
		return maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public KhachHang(String maKH, String hoTen, String dienThoai, String diaChi) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.dienThoai = dienThoai;
		this.diaChi = diaChi;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mã KH: " + maKH + ", Họ tên: " + hoTen + ", Số điện Thoại: " + dienThoai + ", Địa Chỉ: " + diaChi;
	}
	
	
}
