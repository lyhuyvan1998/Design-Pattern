package tonghop_2;

public class HuyDonHangState implements IDonHangState{
	private DonHang dh;

	public HuyDonHangState(DonHang dh) {
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
