/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt_hdt.Chuong02.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lt_hdt.Chuong02.employeelogic.Student;

/**
 *
 * @author Admin
 */
//throws ParseException
public class testStudent {
     public static void main (String [] args) throws ParseException  {
         SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "12-12-2001";
         Date NgaySinh = df.parse(input);
         Student obj = new Student("Dai Hoc Kinh Te Hue", "Xuat Sac", "Nguyen Van Nhat", 1, NgaySinh);
         
        switch(obj.getHocluc()) {
            case "Xuat Sac" :
                obj.setHocbong(1000);
                break;
            case "Gioi" :
                obj.setHocbong(800);
                break;
            default :
                obj.setHocbong(0);
                break;
                
        }
        System.out.println(obj);
        
        
    }
}
