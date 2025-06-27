
package QLSV;

public class SinhVienCNTT extends SinhVienNTU {
    private double diemJava;
    private double diemCSS;
    private double diemHTML;
    //Constructor
    public SinhVienCNTT(String hoTen,String nganh,double diemJava,double diemCSS,double diemHTML){
    super(hoTen,nganh);
    this.diemJava=diemJava;
    this.diemCSS=diemCSS;
    this.diemHTML=diemHTML;
            
    }
    //ghi de phuong thuc getDiem de tinh diem cho nganh cntt
    @Override
    public double getDiem(){
    return (diemJava*2);
    }
    
}
