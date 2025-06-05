/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QLSV {

    public static void main(String[] args) {
        ArrayList<SinhVien> dSSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //1.Nhap vao DSSV
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhapDL();
            dSSV.add(sv);
        }
        //2.xuat DSSV vua nhap 
        System.out.println("Danh sach sinh vien vua nhap: ");
        for (SinhVien x : dSSV) {
            x.xuatDL();
        }
        //3.Tim va xuat sinh vien nam trong khoang min,max do nguoi dung nhap
        System.out.println("Nhap khoang diem trung binh (min): ");
        double minDiem = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap khoang diem trung binh (max): ");
        double maxDiem = sc.nextDouble();
        sc.nextLine();

        System.out.println("Danh sach sinh vien co diem trung binh trong khoang " + minDiem + " den " + maxDiem + ":");
        for (SinhVien sv : dSSV) {
            if (sv.getDiemTB() >= minDiem && sv.getDiemTB() <= maxDiem) {
                sv.xuatDL();
            }
        }

        //.Tim sinh vien theo ho ten
        System.out.println("Nhap ho ten sinh vien can tim: ");
        String tenCanTim = sc.nextLine();

        boolean found = false;
        for (SinhVien sv : dSSV) {
            if (sv.getHoTen().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Da tim thay sinh vien:");
                sv.xuatDL();

                System.out.println("Nhap diem trung binh moi: ");
                double diemMoi = sc.nextDouble();
                sc.nextLine();
                sv.setDiemTB(diemMoi);

                System.out.println("Thong tin sinh vien sau khi cap nhat diem:");
                sv.xuatDL();

                found = true;
                break; // Nếu bạn muốn chỉ sửa sinh viên đầu tiên tìm thấy thì break
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien co ho ten: " + tenCanTim);
        }
        //5.Xoa sinh vien theo ho ten
        System.out.println("Nhap ho ten sinh vien can xoa: ");
        String tenXoa = sc.nextLine();

        boolean daXoa = false;
        for (int i = 0; i < dSSV.size(); i++) {
            if (dSSV.get(i).getHoTen().equalsIgnoreCase(tenXoa)) {
                dSSV.remove(i);
                daXoa = true;
                System.out.println("Da xoa sinh vien co ho ten: " + tenXoa);
                break;  // Nếu muốn xóa tất cả sinh viên cùng tên thì bỏ break
            }
        }
    }
}
