package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:46 PM
 */
public class NhanVienKiemThu extends NhanVien {

	
	public NhanVienKiemThu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienKiemThu(double luong, String maSo, String ten) {
		super(luong, maSo, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getThongTin() {
		// TODO Auto-generated method stub
		return "NhanVienKiemThu [luong=" + luong + ", maSo=" + maSo + ", ten=" + ten + "]";
	}
}//end NhanVienKiemThu