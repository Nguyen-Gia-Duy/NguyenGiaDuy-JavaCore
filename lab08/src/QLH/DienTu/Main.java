import QLH.DienTu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienTu> danhSach = new ArrayList<>();

        System.out.print("Nhap so luong mat hang dien tu: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nMat hang thu " + (i + 1) + ":");
            System.out.print("  Ma hang: ");
            String ma = sc.nextLine();
            System.out.print("  Ten hang: ");
            String ten = sc.nextLine();
            System.out.print("  Xuat xu: ");
            String xx = sc.nextLine();
            System.out.print(" Loai hang: ");
            int loai = Integer.parseInt(sc.nextLine());
            System.out.print(" So luong: ");
            int sl = Integer.parseInt(sc.nextLine());
            System.out.print("  Thoi gian bao hanh: ");
            int tgbh = Integer.parseInt(sc.nextLine());

            danhSach.add(new DienTu(ma, ten, xx, loai, sl, tgbh));
        }

        System.out.println("\n--- Danh sach mat hang dien tu---");
        for (DienTu dt : danhSach) {
            dt.xuat();
        }

        // Thống kê số hàng có tgbh >= 12
        System.out.println("\n---Thong ke theo loai hang ---");
        int loai1 = 0, loai2 = 0;
        for (DienTu dt : danhSach) {
            if (dt.getThoiGianBaoHanh() >= 12) {
                if (dt.getLoaiHang() == 1) loai1++;
                else if (dt.getLoaiHang() == 2) loai2++;
            }
        }
        System.out.println("  Loại 1: " + loai1 + " mặt hàng");
        System.out.println("  Loại 2: " + loai2 + " mặt hàng");

        // Tìm mặt hàng theo tên
        System.out.print("\nNhap ten mat hang can tim: ");
        String tenCanTim = sc.nextLine();
        boolean timThay = false;
        for (DienTu dt : danhSach) {
            if (dt.getTenHang().equalsIgnoreCase(tenCanTim)) {
                System.out.println("  Da tim thay mat hang:");
                dt.xuat();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println(" Khong tim thay mat hang.");
        }

        // Mặt hàng có số lượng nhiều nhất
        DienTu max = danhSach.get(0);
        for (DienTu dt : danhSach) {
            if (dt.getSoLuong() > max.getSoLuong()) {
                max = dt;
            }
        }
        System.out.println("\n--- Mat hang co so luong nhieu nhat ---");
        max.xuat();
    }
}