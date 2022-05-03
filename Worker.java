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
public class Worker extends Person implements Taxinterface {
    private String congty;

    public Worker() {
    }

    public Worker(String congty, String HoTen, int GoiTinh, Date NgaySinh) {
        super(HoTen, GoiTinh, NgaySinh);
        this.congty = congty;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double calcTax(double income) {
        return (0.04 * income);
    }
    
    
}
