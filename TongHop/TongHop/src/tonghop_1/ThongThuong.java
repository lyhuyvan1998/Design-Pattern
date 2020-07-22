package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:51 PM
 */
public class ThongThuong implements ITinhTienThuongStrategy {

	public ThongThuong(){

	}

	@Override
	public double tinhTienThuong(double tienLuongCoBan) {
		return tienLuongCoBan*0.02f;
	}

}//end ThongThuong