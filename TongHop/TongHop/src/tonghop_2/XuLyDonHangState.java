package tonghop_2;

public class XuLyDonHangState implements IDonHangState{
	private DonHang dh;

	public XuLyDonHangState(DonHang dh) {
		super();
		this.dh = dh;
	}

	@Override
	public void datHang() {
		System.out.println("Disable");
	}

	@Override
	public void huyDonHang() {
		dh.setCurrentOrderState(new HuyDonHangState(dh));
		System.out.println("Hủy đơn hàng");
	}

	@Override
	public void xuLyDonHang() {
		System.out.println("Disable");
	}

	@Override
	public void giaoHang() {
		dh.setCurrentOrderState(new GiaoHangState(dh));
		System.out.println("Đơn hàng đang được chuyển đi cho khách hàng");
	}
	
}
