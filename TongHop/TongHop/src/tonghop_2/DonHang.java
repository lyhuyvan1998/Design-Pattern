package tonghop_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DonHang {
	private String maDonHang;
	private Date ngayGioDatHang;
	private List<ChiTietDonHang> dsmh;
	private KhachHang khachHang;
	private IDonHangState currentOrderState;
	public String getMaDonHang() {
		return maDonHang;
	}
	public Date getNgayGioDatHang() {
		return ngayGioDatHang;
	}
	public List<ChiTietDonHang> getDsmh() {
		return dsmh;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public IDonHangState getCurrentOrderState() {
		return currentOrderState;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public void setNgayGioDatHang(Date ngayGioDatHang) {
		this.ngayGioDatHang = ngayGioDatHang;
	}
	public void setDsmh(List<ChiTietDonHang> dsmh) {
		this.dsmh = dsmh;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public void setCurrentOrderState(IDonHangState currentOrderState) {
		this.currentOrderState = currentOrderState;
	}
	public DonHang(String maDonHang, KhachHang khachHang) {
		super();
		this.maDonHang = maDonHang;
		this.ngayGioDatHang = new Date();
		this.khachHang = khachHang;
		this.dsmh= new ArrayList<ChiTietDonHang>();
		this.currentOrderState= new DatDonHangState(this);
	}
	public DonHang() {
		super();
		this.dsmh= new ArrayList<ChiTietDonHang>();
	}
	public void themMatHang(MatHang mh, int soLuong) {
		ChiTietDonHang ct= new ChiTietDonHang(this, mh, soLuong);
		if(dsmh.contains(ct)) {
			ChiTietDonHang ct2=dsmh.get(dsmh.indexOf(ct));
			ct2.setSoLuong(soLuong+ct2.getSoLuong());
		}
		else
			dsmh.add(ct);
	}
	public void xoaMatHang(MatHang mh) {
		ChiTietDonHang ct= new ChiTietDonHang(this, mh, 0);
		if(dsmh.contains(ct)) {
			dsmh.remove(dsmh.get(dsmh.indexOf(ct)));
		}
	}
	public double getTongTien() {
		double tong=0;
		for (ChiTietDonHang chiTietDonHang : dsmh) {
			tong+= chiTietDonHang.getSoLuong()*chiTietDonHang.getMh().getDonGia();
		}
		return tong;
	}
	
	public void inThongTinDonHang() {
		SimpleDateFormat fm= new SimpleDateFormat("dd/MM/yyyy");
		String str=""+String.format("%10s %25s %10s %10s\n","Mã mặt hàng","Tên mặt hàng","Đơn giá","Số lượng đặt");
		
		for (ChiTietDonHang chiTietDonHang : dsmh) {
			MatHang mh= chiTietDonHang.getMh();
			str+=""+ String.format("%10s %25s %10.0f %10s\n", mh.getMaHang(),mh.getTenHang(),mh.getDonGia(),chiTietDonHang.getSoLuong()); 
		}
		System.out.printf("Đơn Hàng\nMã Đơn Hàng=" + maDonHang + "\nNgày Giờ Đặt Hàng=" + fm.format(ngayGioDatHang)
				+ "\nKhách hàng=" + khachHang + "\n" + "Danh sách chi tiết đơn hàng\n"
				+str+"\nTổng tiền: %10.0f\n",getTongTien());
	}
	public void datHang() {
		currentOrderState.datHang();
	}
	public void huyDonHang(){
		currentOrderState.huyDonHang();
	}
	public void xuLyDonHang(){
		currentOrderState.xuLyDonHang();
	}
	public void giaoHang(){
		currentOrderState.giaoHang();
	}
}
