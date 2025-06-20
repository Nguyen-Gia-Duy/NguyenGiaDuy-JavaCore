/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab07;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap account: ");
        String account=sc.nextLine();
        System.out.println("Nhap password: ");
        String pass=sc.nextLine();
        if(account.equals("duy") && pass.length()>=6){
            System.out.println("Dang nhap thanh cong!");
        }
        else
            System.out.println("Dang nhap that bai!");
        sc.close();
    }
    
}
