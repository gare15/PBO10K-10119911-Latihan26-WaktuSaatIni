/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author tegar
 */
public class waktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int detik, menit, jam, hari, bulan, tahun;
        
        GregorianCalendar date = new GregorianCalendar();
        
        
        String namabulan[] = {"Januari","februari", "Maret", "April", "Mei", "Juni", "Juli", "Agusutus", "September", "Oktober", "November", "Desember"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        
        System.out.println("Hari ini adalah hari : " +hari+" " +namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
        
    }
    
}
