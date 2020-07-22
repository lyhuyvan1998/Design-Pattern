package tonghop_2;

public class DatDonHangState implements IDonHangState{
	private DonHang dh;

	public DatDonHangState(DonHang dh) {
		super();
		this.dh = dh;
	}

	@Override
	public void datHang() {
		System.out.println("Đơn hàng khách hàng đã đặt hàng chưa qua xử lý");
	}

	@Override
	public void huyDonHang() {
		dh.setCurrentOrderState(new HuyDonHangState(dh));
		System.out.println("Hủy đơn hàng");
	}

	@Override
	public void xuLyDonHang() {
		dh.setCurrentOrderState(new XuLyDonHangState(dh));
		System.out.println("Đơn hàng được nhân viên " + 
				"chuẩn bị các mặt hàng trong kho");
	}

	@Override
	public void giaoHang() {
		System.out.println("Disable");
	}
	
}
