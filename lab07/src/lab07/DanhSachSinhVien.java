
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

    public static void main(String[] args) {
        ArrayList<SinhVien> dSSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            dSSV.add(sv);
        }

        //2. Xuat DSSV vua nhap 
        System.out.println("Danh sach sinh vien vua nhap: ");
        for (SinhVien x : dSSV) {
            x.xuat();
        }

        //3. Tim kiem ten khong phan biet hoa thuong
        System.out.println("Nhap ho ten sinh vien can tim: ");
        String tenCanTim = sc.nextLine();

        boolean found = false;
        for (SinhVien sv : dSSV) {
            if (sv.getHoTen().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Da tim thay sinh vien:");
                sv.xuat();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien co ho ten: " + tenCanTim);
        }
        //4.Liệt kê sinh viên có số điện thoại thuộc nhà mạng Viettel (bắt đầu bằng “03”).
        // 4. Liet ke sinh vien co so dien thoai thuoc nha mang Viettel (bat dau bang "03")
        System.out.println("Danh sach sinh vien thuoc nha mang Viettel (SDT bat dau bang '03'):");
        boolean coViettel = false;
        for (SinhVien sv : dSSV) {
            if (sv.getSoDienThoai().startsWith("03")) {
                sv.xuat();
                coViettel = true;
            }
        }
        if (!coViettel) {
            System.out.println("Khong co sinh vien nao co so dien thoai thuoc nha mang Viettel.");
        }
        //5.Sắp xếp danh sách sinh viên theo tên (lấy phần tên trong họ tên).
        dSSV.sort((sv1, sv2) -> sv1.getTen().compareToIgnoreCase(sv2.getTen()));

        System.out.println("Danh sach sinh vien sau khi sap xep theo ten:");
        for (SinhVien sv : dSSV) {
            sv.xuat();
        }
        //6.Xóa sinh viên theo CCCD.
        System.out.print("Nhap CCCD cua sinh vien can xoa: ");
        String cccdCanXoa = sc.nextLine();

        boolean daXoa = false;
        for (int i = 0; i < dSSV.size(); i++) {
            if (dSSV.get(i).getCccd().equals(cccdCanXoa)) {
                dSSV.remove(i);
                System.out.println("Da xoa sinh vien co CCCD: " + cccdCanXoa);
                daXoa = true;
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Khong tim thay sinh vien co CCCD: " + cccdCanXoa);
        }
        //7.Đếm số lượng sinh viên có CCCD bắt đầu bằng "0".
        int dem = 0;
        for (SinhVien sv : dSSV) {
            if (sv.getCccd().startsWith("0")) {
                dem++;
            }
        }

        System.out.println("So luong sinh vien co CCCD bat dau bang '0' la: " + dem);

    }
}
