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
public class HinhChuNhat {
    //khai bao cac thuoc tinh
    private double chieuDai;
    private double chieuRong;
    //Tao constructor khong co tham so
    public HinhChuNhat(){
        this.chieuDai=0;
        this.chieuRong=0;
    }
    //Tao constructor co tham so
    public HinhChuNhat(double dai,double rong){
        this.chieuDai=dai;
        this.chieuRong=rong;
    }
    //Cac phuong thuc
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        chieuDai=sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        chieuRong=sc.nextDouble();
                
    }
         // GETTER
    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
    public double tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public double tinhDienTich(){
        return chieuDai*chieuRong;
    }
    //SETTER

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public void xuat(){
        System.out.println("Chieu dai:"+chieuDai);
        System.out.println("Chieu rong:"+chieuRong);
        System.out.println("Chu Vi:" + tinhChuVi());
        System.out.println("Dien tich:"+tinhDienTich());
    }
}
