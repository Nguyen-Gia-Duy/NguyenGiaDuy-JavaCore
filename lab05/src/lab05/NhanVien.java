/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private int soNgayCong;
    private double tienCongNgay;
    //
    public NhanVien(){
        maNV="";
        hoTen="";
        soNgayCong=0;
        tienCongNgay=0.0;
    }
    //constructor co tham so
    public NhanVien(String maNV,String hoTen,int soNgayCong,double tienCongNgay){
    this.maNV=maNV;
    this.hoTen=hoTen;
    this.soNgayCong=soNgayCong;
    this.tienCongNgay=tienCongNgay;
}
