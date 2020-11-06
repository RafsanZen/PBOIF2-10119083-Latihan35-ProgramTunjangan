/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan35.programtunjangan;

import java.util.Scanner;
/**
 *
 * Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Program Tunjangan
 */
public class PBOIF210119083Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        HitungGaji hitungGaji = new HitungGaji();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        hitungGaji.setGaji(scanner.nextDouble());
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        hitungGaji.setStatus(scanner.next());
        
        hitungGaji.tampilHasilPerhitungan();
        
         System.out.println("Developed by : Rafsan Zen Mustaofa");
    
    }
    
}
