/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class nhanvien1 {
     private String maNV;
    private String hoTen;
    public double soGioCong;
    private double heSoLuong;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap so gio cong:");
        soGioCong = sc.nextDouble();
        System.out.print("Nhap he so luong:");
        heSoLuong = sc.nextDouble();
        sc.nextLine();
    }

    public double tinhLuong() {
        return heSoLuong * 18000;
    }

    public void xuat() {
        System.out.printf("%-10s %-30s %-10.2f %-15.2f \n", maNV, hoTen, heSoLuong, tinhLuong());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien");
        int n = sc.nextInt();
        sc.nextLine();
        //Khai bao mang nham vien
        NhanVien[] dsNhanVien = new NhanVien[n];
        //Nhap du lieu 
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap thong tin cho nhan vien thu %d: \n", i + 1);
            dsNhanVien[i] = new NhanVien(); //Tao ds nhan vien
            dsNhanVien[i].nhap();
        }
         System.out.println("---------------------");
        //Xuat du lieu va tinh luong cho Nhan Vien
        System.out.printf("%-10s %-30s %-10s %-15s \n","Ma NV","Ten NV","HeSL","Thuc Linh");
        for(int i=0;i<n;i++){
           dsNhanVien[i].xuat();
        }
        sc.close();
    }
}
