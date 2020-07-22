package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:53 PM
 */
public class DuAnNgoaiTinh implements ITinhTienThuongStrategy {

	public DuAnNgoaiTinh(){

	}

	@Override
	public double tinhTienThuong(double tienLuongCoBan) {
		return tienLuongCoBan*0.15f;
	}

}//end DuAnNgoaiTinh