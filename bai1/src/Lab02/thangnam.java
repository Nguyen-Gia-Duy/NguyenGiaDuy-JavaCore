/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class thangnam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang bat ki (1-12): ");
        int thang= sc.nextInt();
        System.out.println("Nhap nam");
        int nam=  sc.nextInt();
        int soNgay;
        switch(thang){
            case 1,3,5,7,8,10,12->soNgay=31;
            case 4,6,9,11->soNgay=30;
            case 2->{
            if(nam%4==0)
                soNgay=29;
            else
                soNgay=28;
                }
            default->{
                System.out.println("Thang khong hop le!");
            return;
            }
        }
           System.out.printf("Thang %d nam %d co %d ngay\n",thang,nam,soNgay); 
        
        }                              
    }
    
