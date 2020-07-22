package tonghop_2;

public class ChiTietDonHang {
	private DonHang dh;
	private MatHang mh;
	private int soLuong;
	public DonHang getDh() {
		return dh;
	}
	public MatHang getMh() {
		return mh;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setDh(DonHang dh) {
		this.dh = dh;
	}
	public void setMh(MatHang mh) {
		this.mh = mh;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public ChiTietDonHang(DonHang dh, MatHang mh, int soLuong) {
		super();
		this.dh = dh;
		this.mh = mh;
		this.soLuong = soLuong;
	}
	public ChiTietDonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dh == null) ? 0 : dh.hashCode());
		result = prime * result + ((mh == null) ? 0 : mh.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietDonHang other = (ChiTietDonHang) obj;
		if (dh == null) {
			if (other.dh != null)
				return false;
		} else if (!dh.equals(other.dh))
			return false;
		if (mh == null) {
			if (other.mh != null)
				return false;
		} else if (!mh.equals(other.mh))
			return false;
		return true;
	}
	
}
