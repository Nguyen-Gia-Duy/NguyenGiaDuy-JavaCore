package Lab02;

import java.util.Scanner;

public class ktSoNT {
    public static void main(String[] args) {
       int n,i;
       Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        n=sc.nextInt();
        while(n<2){
            System.out.println("Nhap lai n>=2: ");
            n=sc.nextInt();    
        }
        if(n==2){
            System.out.println("Day la so nguyen to.");
        }
        else{
            for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Day khong phai la so nguyen to");
                sc.close();
                System.exit(0);
            }
            }
            }
        System.out.printf("%d la so nguyen to!",n);
        }
            
       
    }

