package lab07;

import java.util.ArrayList;

public class QLSP {

    public static void main(String[] args) {
        ArrayList<SanPham> dSSP = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap san pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            dSSP.add(sp);
        }
        System.out.println("Cac san pham co hang Nokia la : ");
        for (SanPham sp : dSSP) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }

}
