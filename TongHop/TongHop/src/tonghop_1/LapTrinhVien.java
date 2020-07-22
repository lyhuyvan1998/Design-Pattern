package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:44 PM
 */
public class LapTrinhVien extends NhanVien {


	public LapTrinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LapTrinhVien(double luong, String maSo, String ten) {
		super(luong, maSo, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getThongTin() {
		// TODO Auto-generated method stub
		return "LapTrinhVien [luong=" + luong + ", maSo=" + maSo + ", ten=" + ten + "]";
	}
}//end LapTrinhVien