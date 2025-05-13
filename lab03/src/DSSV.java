import java.util.Scanner;

public class DSSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xoa bo xuong dong

        String[] hoTen = new String[n];
        float[] diemTB = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten sinh vien " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();

            System.out.print("Nhap diem trung binh: ");
            diemTB[i] = sc.nextFloat();
            sc.nextLine(); // Xoa bo xuong dong
        }

        System.out.println("\nDanh sach sinh vien:");
        for (int i = 0; i < n; i++) {
            String xepLoai;

            if (diemTB[i] >= 8.5) {
                xepLoai = "Gioi";
            } else if (diemTB[i] >= 6.5) {
                xepLoai = "Kha";
            } else if (diemTB[i] >= 5.0) {
                xepLoai = "Trung binh";
            } else {
                xepLoai = "Yeu";
            }

            System.out.printf("Ho ten: %s, Diem TB: %.2f, Xep loai: %s\n", hoTen[i], diemTB[i], xepLoai);
        }

        sc.close();
    }
}
