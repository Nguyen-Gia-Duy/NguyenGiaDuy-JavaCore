
package lab08.HinhHoc;
public class HinhChuNhat {
    protected double dai;
    protected double rong;
    
    public HinhChuNhat(double dai,double rong){
    this.dai=dai;
    this.rong=rong;
    }
    //Phuong thuc lay  ChuVi DienTich
    public double getChuVi(){
    return (dai+rong)*2;
    }
    public double getDienTich(){
    return dai*rong;
    }
    //Phuong thuc xuat DL
    public void xuat(){
        System.out.println("Chieu dai"+dai+"| Chieu rong"+rong);
        System.out.println("Chu vi: "+getChuVi());
        System.out.println("Dien tich: "+getDienTich());
    }
}
