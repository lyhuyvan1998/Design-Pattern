package tonghop_2;

public class GiaoHangState implements IDonHangState{
	private DonHang dh;

	public GiaoHangState(DonHang dh) {
		super();
		this.dh = dh;
	}

	@Override
	public void datHang() {
		System.out.println("Disable");
	}

	@Override
	public void huyDonHang() {
		System.out.println("Disable");
	}

	@Override
	public void xuLyDonHang() {
		System.out.println("Disable");
	}

	@Override
	public void giaoHang() {
		System.out.println("Disable");
	}
	
}
