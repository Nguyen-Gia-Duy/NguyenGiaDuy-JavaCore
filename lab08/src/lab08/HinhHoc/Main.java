
package lab08.HinhHoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thong tin hinh chu nhat: ");
        System.out.println("Nhap chieu dai: ");
        double dai=sc.nextDouble();
          System.out.println("Nhap chieu rong: ");
        double rong=sc.nextDouble();
        HinhChuNhat cn=new HinhChuNhat(dai,rong);
        System.out.println("Ket qua: ");
        cn.xuat();
        
        System.out.println("Nhap thong tin hinh vuong: ");
        System.out.println("Nhap canh hinh vuong:");
        double canh=sc.nextDouble();
        HinhVuong hv=new HinhVuong(canh);
        System.out.println("Ket qua:");
        hv.xuat();
        sc.close();
    }
}
