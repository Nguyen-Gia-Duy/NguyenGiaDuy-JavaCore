
package QLH;

public class DienTu extends QLH {
    private int thoiGianBaoHanh; // theo tháng

    public DienTu(String maHang, String tenHang, String xuatXu, int loaiHang, int soLuong, int thoiGianBaoHanh) {
        super(maHang, tenHang, xuatXu, loaiHang, soLuong);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh + " Thang");
    }
}