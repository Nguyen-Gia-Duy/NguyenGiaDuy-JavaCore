/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai3 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Nhập cạnh khối lập phương
        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = scanner.nextDouble();

        // Tính thể tích
        double theTich = Math.pow(canh, 3);

        // Xuất kết quả
        System.out.println("The tich cua khoi lap phuong la: " + theTich);

        scanner.close();
    }
}
