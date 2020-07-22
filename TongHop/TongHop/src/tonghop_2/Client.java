package tonghop_2;

public class Client {
	public static void main(String[] args) {
		DonHang dh= new DonHang("1", new KhachHang("1", "Hà", "01234567", "Gò Vấp"));
		
		MatHang mh= new MatHang("1", "Điện thoại", 100f);
		MatHang mh2= new MatHang("2", "Điện thoại 2", 50f);
		dh.themMatHang(mh, 1);
		dh.themMatHang(mh, 2);
		dh.themMatHang(mh2, 2);
		dh.inThongTinDonHang();
		dh.datHang();
		dh.xuLyDonHang();
		dh.giaoHang();
		dh.huyDonHang();
		dh.datHang();
	}
}
