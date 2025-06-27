
package QLSV;

public abstract class SinhVienNTU {
    protected String hoTen;
    protected String nganh;
    
    public SinhVienNTU(String hoTen,String nganh){
    this.hoTen=hoTen;
    this.nganh=nganh;
    }
    //Phuong thuc truu tuong de lay diem
    public abstract double getDiem();
    //Phuong thuc xep loai hoc luc
    public String getHocLuc(){
    double diem=getDiem();
    if(diem<5)
        return "yeu";
    else if(diem<6.5)
        return "Trung Binh";
    else if(diem<8)
        return "Kha";
    else if(diem<9)
        return "Gioi";
    else 
        return "xuat xac";
    }
    //phuong tuc xuat du lieu
    public void xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nganh:"+nganh);
        System.out.println("Diem: "+getDiem());
        System.out.println("Hoc Luc: "+getHocLuc());
    }
}
