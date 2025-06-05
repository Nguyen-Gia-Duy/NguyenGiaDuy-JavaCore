package lab06;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> ds = new ArrayList<>();
        Double tong = 0.0;
        System.out.println("Nhap vao danh sach so thuc: ");
        while (true) {
            System.out.print("Nhap so: ");
            String input = sc.nextLine();
            try {
                Double x = Double.parseDouble(input);
                if (x == 0) {
                    break;
                } else {
                    ds.add(x);
                    tong += x;
                }
            } catch (NumberFormatException e) {
                System.out.println("Loi:Hay nhap kieu so thuc!");
            }
        }
        System.out.println("Danh sach cac so vua nhap: ");
        for (Double x : ds) {
            System.out.printf("%-10.2f", x);
        }
        System.out.printf("Tong la:%-10.2f", tong);
        //Mot so phuong thuc trong arraylít
        //1.Them Phan tu vao cuoi ds
        
        ds.add(3.5);
        //2.them phan tu vao vi tri nao do
        ds.add(1,9.0);
        //3.Xoa phan tu
        ds.remove(3.5);
        //4.Xoa phan tu o vi tri bat ki
        ds.remove(2);
        //5.Gan phan tu tai vi tri
        ds.set(0,20.5);
        //6.Truy xuat phan tu
        System.out.println("Phan tu dau tien: "+ds.get(0));
        //7.Hien thi so phan tu cua mang
        System.out.println("So phan tu cua mang: "+ds.size());
        //8.Kiem tra su ton tai cua phan tu
        if(ds.contains(12)){
            System.out.println("So do co nam trong day!");
        }
        //9.Kiem tra day so co rong khong
        if(ds.isEmpty()){
            System.out.println("Danh sach rong!");
        }
        //10.Tim vi tri cua phan tu
        int vitri=ds.indexOf(12);
        System.out.println("Phan tu so 12 o vi tri: "+vitri);
        //Sap xep theo chieu giam dan
        Collections.sort(ds);
        Collections.reverse(ds);
        System.out.println("Danh sach sau khi sap xep: ");
        for(Double x:ds){
            System.out.printf("%-10.2f",x);
        }
    }
    

}
