/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt_hdt.Chuong02.employeelogic;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements Taxinterface {
    private String truonghoc;
    private String hocluc;
    private double hocbong;
    
    public Student() {
    }

    public Student(String truonghoc, String HoTen, int GoiTinh, Date NgaySinh) {
        super(HoTen, GoiTinh, NgaySinh);
        this.truonghoc = truonghoc;
    }

    public Student(String truonghoc, String hocluc, double hocbong, String HoTen, int GoiTinh, Date NgaySinh) {
        super(HoTen, GoiTinh, NgaySinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
        this.hocbong = hocbong;
    }

    public Student(String dai_Hoc_Kinh_Te_Hue, String xuat_Sac, String nguyen_Van_Nhat, int i, Date NgaySinh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }
    
    

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01 * income;
        return tax;
    }

    @Override
    public String toString() {
        String KetQua = super.toString();
        KetQua += "Student{" + "truonghoc=" + truonghoc + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
        return KetQua;
    }
    
}
