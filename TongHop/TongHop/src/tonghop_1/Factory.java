package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:49 PM
 */
public class Factory {

	public Factory(){

	}

	public NhanVien createNhanVien(String loai){
		loai = loai.toLowerCase();
		switch (loai) {
		case "laptrinhvien":
			return new LapTrinhVien();
		case "ketoan":
			return new NhanVienKeToan();
		case "kiemthu":
			return new NhanVienKiemThu();
		case "chuyenvienphantichdulieu":
			return new ChuyenVienPhanTichDuLieu();
		default:
			return null;
		}
	}
}//end Factory