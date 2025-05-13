package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        int a[], n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Nhap gia tri tung phan tu");
        for (i = 0; i < n; i++) {
            System.out.printf("a%d:=", i);
            a[i] = sc.nextInt();
        }
        //in day vua nhap ra man hinh
        System.out.println("Day so vua nhap");
        for (int x : a) {
            System.out.print(x + " ");
        }
        //Sap xep day so theo chieu tang dan
        Arrays.sort(a);
        System.out.println("\nDay so sau khi sap xep");
        for (int x : a) {
            System.out.print(x + " ");
        }
        //Nhap vao 1 so k bat ki
        int k,dem=0;
        System.out.println("\nNhap k: ");
        k=sc.nextInt();
        for(int x:a){
            if(x==k)
                dem++;          
        }
        if(dem>0)
            System.out.printf("So lan xuat hien cua k trong day la: %d\n",dem);
        else
            System.out.println("k khong xuat hien trong day!");
        sc.close();
    }

}
