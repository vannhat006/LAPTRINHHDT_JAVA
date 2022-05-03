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
public class Person {
    private String HoTen;
    private int GioiTinh;
    private Date NgaySinh;

    public Person() {
    }

    public Person(String HoTen, int GoiTinh, Date NgaySinh) {
        this.HoTen = HoTen;
        this.GioiTinh = GoiTinh;
        this.NgaySinh = NgaySinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getGoiTinh() {
        return GioiTinh;
    }

    public void setGoiTinh(int GoiTinh) {
        this.GioiTinh = GoiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    @Override
    public String toString() {
        return "Person{" + "HoTen=" + HoTen + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + '}';
    }
    
    
}
