/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author DELL
 */
public class ChuViDienTichHCN {
    public static void main(String[] args) {
        //SU dung constructor khing co tham so
        
        HinhChuNhat hCN1=new HinhChuNhat();
        hCN1.nhap();
        hCN1.xuat();
        
        System.out.println("----------------");
        //Su dung constructor co tham so 
        HinhChuNhat hCN2=new HinhChuNhat(10,20);
        hCN2.xuat();
         System.out.println("----------------");
         hCN2.setChieuDai(100);
         hCN2.xuat();
    }
}
