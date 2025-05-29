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
public class QLNV_Mang {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien");
        int n=sc.nextInt();
        NhanVien[] dsNV=new NhanVien[n];
        // nhap thong tin cho n nhan vien
        for (int i=0;i<n;i++){
            System.out.println("Nhap thong tin cua nhan vien");
            dsNV[i]=new NhanVien();
            dsNV[i].nhapDL();
        }
        // in danh sach vua nhap ra man hinh 
        System.out.println("Thong tin sinh vien sinh vien vua nhap : ");
        for(NhanVien nv: dsNV){
            nv.xuatDL();
        }
    }
}
