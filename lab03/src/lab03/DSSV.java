package lab03;

import java.util.Scanner;

public class DSSV {

    public static void main(String[] args) {
        String s[];
        Double d[];
        String xl[];
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so sinh vien:");
        n = sc.nextInt();
        sc.nextLine();
        s = new String[n];
        d = new Double[n];
        xl = new String[n];
        System.out.println("Nhap thong tin cho tung sinh vien");
        for (i = 0; i < n; i++) {
            System.out.printf("Sinh vien thu %d: \n", i + 1);
            System.out.print("Nhap ho va ten:");
            s[i] = sc.nextLine();
            System.out.println("Nhap diem:");
            d[i] = sc.nextDouble();
            sc.nextLine();
        }
        //In DSSV vua nhap ra man hinh
        System.out.println("Danh sach sinh vien vua nhap la:");
        for (i = 0; i < n; i++) {
            System.out.printf("%-30s %-10.2f \n", s[i], d[i]);
        }
        //sap xep theo chieu tang dan diem TB
        Double tg;
        String hoTen;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (d[i] > d[j]) //Doi cho bang diem TB
                {
                    tg = d[i];
                    d[i] = d[j];
                    d[j] = tg;
                    //Doi cho cua bang chua ho ten
                    hoTen = s[i];
                    s[i] = s[j];
                    s[j] = hoTen;
                }
                //Xep loai cho sinh vien
                for (i = 0; i < n; i++) {
                    if (d[i] < 5) {
                        xl[i] = "Yeu";
                    } else if (d[i] < 6.5) {
                        xl[i] = "Trung Binh";
                    } else if (d[i] < 8) {
                        xl[i] = "Kha";
                    } else {
                        xl[i] = "Gioi";
                    }
                    //In DSSV sau khi sap xep va xep loai
                        System.out.println("Danh sach sinh vien sau khi sap xep:");
                        for(i=0;i<n;i++){
                            System.out.printf("%-30s %-10.2f %-10s \n",s[i],d[i],xl[i]);
                        }
                }

            }
        }

    }
}
