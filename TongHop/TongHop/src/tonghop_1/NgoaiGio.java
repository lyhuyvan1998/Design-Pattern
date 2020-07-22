package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:52 PM
 */
public class NgoaiGio implements ITinhTienThuongStrategy {

	public NgoaiGio(){
		
	}

	@Override
	public double tinhTienThuong(double tienLuongCoBan) {
		return tienLuongCoBan*0.1f;
	}
}//end NgoaiGio