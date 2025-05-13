/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TieuThuDienNang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so ho gia dinh: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xóa dòng thừa

        String[] tenChuHo = new String[n];
        double[] soDien = new double[n];

        // Nhập dữ liệu
        for (int i = 0; i < n; i++) {
            System.out.println("\nHo thu " + (i + 1));
            System.out.print("Ten chu ho: ");
            tenChuHo[i] = sc.nextLine();
            System.out.print("So dien tieu thu (kWh): ");
            soDien[i] = sc.nextDouble();
            sc.nextLine(); // Xóa dòng thừa
        }

        // Sắp xếp giảm dần theo số điện
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (soDien[i] < soDien[j]) {
                    double tempDien = soDien[i];
                    soDien[i] = soDien[j];
                    soDien[j] = tempDien;

                    String tempTen = tenChuHo[i];
                    tenChuHo[i] = tenChuHo[j];
                    tenChuHo[j] = tempTen;
                }
            }
        }

        // Hiển thị kết quả
        System.out.printf("\n%-25s %-10s %-15s\n", "Ten chu ho", "kWh", "Danh gia");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            String danhGia;
            if (soDien[i] < 50) {
                danhGia = "Tiet kiem";
            } else if (soDien[i] < 100) {
                danhGia = "Trung binh";
            } else if (soDien[i] < 200) {
                danhGia = "Cao";
            } else {
                danhGia = "Rat cao";
            }

            System.out.printf("%-25s %-10.2f %-15s\n", tenChuHo[i], soDien[i], danhGia);
        }

        sc.close();
    }
}
