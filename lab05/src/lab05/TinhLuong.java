/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TinhLuong {
      public static void main(String[] args) {
        String maNV, hoTen;
        int soNgayCong;
        Double tienCongNgay;
        // cach 1 dung constructor co tham so
        System.out.println("Nhap thong tin cho sinh vien thu nhat :");
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma nv");
        maNV=sc.nextLine();
        System.out.print("Nhap ho ten");
        hoTen=sc.nextLine();
        System.out.println("Nhap so ngay cong");
        soNgayCong=sc.nextInt();
        System.out.println("Nhap tieg cong 1 ngay: ");
        tienCongNgay=sc.nextDouble();
        sc.nextLine();
        NhanVien nv1 = new NhanVien(maNV,hoTen,soNgayCong,tienCongNgay);
        nv1.xuatDL();
        NhanVien nv2 = new NhanVien();
        System.out.print("Nhap ma NV: ");
        nv2.setMaNV(sc.nextLine());
        System.out.print("Nhap ho ten :");
        nv2.setHoTen(sc.nextLine());
        System.out.print("Nhap so ngay cong:");
        nv2.setSoNgayCong(sc.nextInt());
        System.out.println("nhap tien cong 1 ngay:");
        nv2.setTienCongNgay(sc.nextDouble());
        nv2.xuatDL();
        // cach 3
        System.out.println("Nhap thong tin nhan vien thu 3");
        NhanVien nv3 = new NhanVien();
        nv3.xuatDL();
    }
}
