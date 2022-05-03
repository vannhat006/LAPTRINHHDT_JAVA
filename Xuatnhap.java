/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt_hdt.donglenh.Chuong01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Xuatnhap {
 public static void main(String[] args) {
     boolean flag = true;
     int a = 15;
     byte b =2;
     double c = 12.6;
     float d = 4.5f;
     String s = "Hello world";
     char ch = 'A';
      
     Scanner sc = new Scanner(System.in);
     System.out.print("Hay nhap ho ten: "); //bỏ ln ở sau print là để người dùng nhập vào
     String hoten = sc.nextLine();
     System.out.println("Ban da nhap ho ten la: " + hoten);
     
     System.out.print("Hay nhap vao mot so nguyen: "); 
     String input = sc.nextLine();
     a = Integer.parseInt(input);    
     System.out.println("Ban da nhap so nguyen la: " + a);
     
     System.out.print("Hay nhap vao mot so thuc: ");
      input = sc.nextLine();  // khong can khai bao string, vi o tren da khai bao roi
     c = Double.parseDouble(input);    
     System.out.println("Ban da nhap so thuc la: " + c);
 }
}
