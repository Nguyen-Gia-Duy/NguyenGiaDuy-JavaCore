
import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String soDienThoai;
    private String cccd;

    public SinhVien() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getTen() {
        String[] parts = hoTen.trim().split("\\s+");
        return parts[parts.length - 1]; // Tên là từ cuối cùng
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        do {
            System.out.print("Nhap Sdt: ");
            soDienThoai = sc.nextLine();
            if (!soDienThoai.matches("\\d{10}")) {
                System.out.println("Sdt khong hop le. Nhap lai.");
            }
        } while (!soDienThoai.matches("\\d{10}"));

        do {
            System.out.print("Nhap CCCD: ");
            cccd = sc.nextLine();
            if (!cccd.matches("\\d{12}")) {
                System.out.println("CCCD khong hop le. Nhap lai.");
            }
        } while (!cccd.matches("\\d{12}"));
    }

    public void xuat() {
        System.out.println("| Ho tem: " + hoTen + "| SDT: " + soDienThoai + "| CCCD: " + cccd);
    }
}
