
package QLH;


public class QLH {
      private String maHang;
    private String tenHang;
    private String xuatXu;
    private int loaiHang; // 1 hoặc 2
    private int soLuong;

    public QLH(String maHang, String tenHang, String xuatXu, int loaiHang, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.xuatXu = xuatXu;
        this.loaiHang = loaiHang;
        this.soLuong = soLuong;
    }

    public int getLoaiHang() {
        return loaiHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void xuat() {
        System.out.println("Ma hang: " + maHang + ", Ten hang: " + tenHang + ", Xuat xu: " + xuatXu + ", Loai hang: " + loaiHang + ", So luong: " + soLuong);
    }
}
