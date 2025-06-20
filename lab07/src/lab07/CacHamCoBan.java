/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author DELL
 */
public class CacHamCoBan {
    public static void main(String[] args) {
        String s1="Hello WOLD";
        System.out.println(s1.toLowerCase()); //chuyen hoa thanh thuong
        String s2="java";
        System.out.println(s2.toUpperCase()); // chuyen thuong thanh hoa
        String s3="  Java core 1  ";
        System.out.println(s3.trim()); //Cat ki tu trang truoc sau
        String s4="Hello WOLD";
        System.out.println(s4.substring(0, 5)); // lay ra bao nhieu ki tu 
        String s5="Hello WOLD";
        System.out.println(s5.charAt(3)); //Lay ki tu tai vi tri
        String s6="abc xyz abc def";
        System.out.println(s6.replaceAll("abc", "HN"));// tim kiem va thay the
        String hoTen="Duy,Nam,Hai,Anh";
        String[] ten=hoTen.split(","); // tach cac ki tu thanh tung mang qua dau","
        for(String x:ten){
            System.out.println(x);
        }
        String s7="Hello WORD";
        System.out.println(s7.contains("WO")); // kiem tra xem co nam trong chuoi ko
        System.out.println(s7.startsWith("Hello"));//Bat dau 
        System.out.println(s7.endsWith("WORD"));//Ket thuc
        System.out.println(s7.indexOf("l")); //tim vi tri ki tu  bat dau
        System.out.println(s7.lastIndexOf("l"));// tim vi tri ki tu ket thuc
    }
}
