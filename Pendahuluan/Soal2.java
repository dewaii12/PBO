/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;
public class Soal2 {

    public static void main(String[] args) {
        Scanner gacoan = new Scanner(System.in);
        
        System.out.print("Jumlah Uang yang dimiliki: ");
        double uang = gacoan.nextDouble();
        
        System.out.print("Tidak Memiliki Jadwal Kelas Kuliah Saat Ini? (true/false): ");
        boolean tidakAdaKelasKuliah = gacoan.nextBoolean();
        
        if (uang > 10000 && tidakAdaKelasKuliah) {
            System.out.println("Anda Keluar Membeli Migacoan!");
        } else {
            System.out.println("Anda Tidak Dapat keluar Membeli Migacoan.");
        }
    }
}
