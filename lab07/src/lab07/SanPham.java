package lab07;

import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private double donGia;
    private String hang;

    public SanPham() {

    }

    public String getTenSp() {
        return tenSP;
    }

    public void setTenSp(String tenSp) {
        this.tenSP = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        //Bay loi TH nguoi dung nhap ko phai kieu so
        boolean hople = false;
        while (!hople) {
            System.out.println("Nhap don gia: ");
            try {
                donGia =Double.parseDouble(sc.nextLine());
                sc.nextLine();
                hople = true;
            } catch (NumberFormatException e) {
                System.out.println("Don gia phai la kieu so!");
            }
        }

        System.out.println("Nhap hang: ");
        hang = sc.nextLine();

    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSP + " | Don Gia: " + donGia + " | Hang:" + hang);
    }
}
