package lab07;

import java.util.Scanner;

public class BieuThucChinhQuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai: ");
        String sdt = sc.nextLine();
        if (sdt.length() == 10 && sdt.startsWith("0") && sdt.matches("\\d {10}"
        )) {
            System.out.println("SDT hop le !");
        } else {
            System.out.println("SDT khong hop le");
        }
    }
}
