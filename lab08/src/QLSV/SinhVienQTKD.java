package QLSV;

public class SinhVienQTKD extends SinhVienNTU {

    private double diemMaketing;
    private double diemSale;

    public SinhVienQTKD(String hoTen, String nganh, double diemMaketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMaketing = diemMaketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (diemMaketing * 2 + diemSale) / 3;
    }
}
