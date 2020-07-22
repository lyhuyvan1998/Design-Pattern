package tonghop_2;

public class MatHang {
	private String maHang;
	private String tenHang;
	private double donGia;
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public MatHang(String maHang, String tenHang, double donGia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
	}
	public MatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MatHang [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + "]";
	}
	
}
