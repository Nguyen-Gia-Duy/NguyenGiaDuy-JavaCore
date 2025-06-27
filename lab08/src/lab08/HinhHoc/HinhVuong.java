
package lab08.HinhHoc;
public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh){
    super(canh,canh);
    }
    @Override
    public void xuat(){
        System.out.println("Canh: "+dai);
        System.out.println("Chu Vi:"+getChuVi());
        System.out.println("Dien Tich"+getDienTich());
    }
}
