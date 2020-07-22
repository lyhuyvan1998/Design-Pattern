package tonghop_1;


/**
 * @author Ha Nguyen
 * @version 1.0
 * @created 21-Jul-2020 8:13:49 PM
 */
public class Client {
	public static void main(String[] args) {
		Factory factory= new Factory();
		NhanVien nv = factory.createNhanVien("laptrinhvien");
		nv.setMaSo("1");
		nv.setLuong(10000f);
		nv.setTen("Nguyen Ngoc Ha");
		System.out.println(nv.getThongTin());
		nv.setTinhTienThuong(new NgoaiGio());
		System.out.println("Tiền thưởng ngoài giờ:");
		nv.tinhTienThuong();
		NhanVien nv1 = factory.createNhanVien("ketoan");
		nv1.setMaSo("2");
		nv1.setLuong(5000f);
		nv1.setTen("Nguyen Van An");
		System.out.println("\n"+nv1.getThongTin());
		nv1.setTinhTienThuong(new ThongThuong());
		System.out.println("Tiền thưởng thông thường:");
		nv1.tinhTienThuong();
	}
}//end Client