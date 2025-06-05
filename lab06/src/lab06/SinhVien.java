
package lab06;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private double diemTB;

    // Hàm tạo không đối
    public SinhVien() {
    }

    // Hàm tạo có đối số
    public SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // Getter và Setter

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
  public void nhapDL(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Nhap ho ten: ");
      hoTen=sc.nextLine();
      System.out.println("Nhap Diem TB: ");
      diemTB=sc.nextDouble();
      sc.nextLine();      
  }
  public void xuatDL(){
      System.out.println("Ho ten: "+hoTen +" Diem TB: "+diemTB);
  }
}
