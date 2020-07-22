package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:47 PM
 */
public class ChuyenVienPhanTichDuLieu extends NhanVien {


	public ChuyenVienPhanTichDuLieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuyenVienPhanTichDuLieu(double luong, String maSo, String ten) {
		super(luong, maSo, ten);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getThongTin() {
		return "ChuyenVienPhanTichDuLieu [luong=" + luong + ", maSo=" + maSo + ", ten=" + ten +"]";
	}
}//end ChuyenVienPhanTichDuLieu