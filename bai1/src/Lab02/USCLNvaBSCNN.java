package Lab02;

import java.util.Scanner;

public class USCLNvaBSCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,r;
        System.out.println("Nhap a: ");
        a= sc.nextInt();
        System.out.println("Nhap b: ");
        
        b=sc.nextInt();
         int bscnn=a*b;
        while(b!=0){
        r=a%b;
        a=b;
        b=r;
        }
        System.out.printf("USCLN la: %d\n",a);
        System.out.printf("BSNCC la: %d\n",bscnn/a);
        
    }
}
