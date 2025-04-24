/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
          
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Ho va ten: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Diem TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất kết quả ra màn hình
        System.out.printf("%s %.2f diem\n", hoTen, diemTB);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    
    }
    
}
