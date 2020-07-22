package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:48 PM
 */
public class NhanVienKeToan extends NhanVien {

	
	public NhanVienKeToan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienKeToan(double luong, String maSo, String ten) {
		super(luong, maSo, ten);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getThongTin() {
		// TODO Auto-generated method stub
		return "NhanVienKeToan [luong=" + luong + ", maSo=" + maSo + ", ten=" + ten + "]";
	}
}//end NhanVienKeToan