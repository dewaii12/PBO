/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;
public class Soal1 {

    public static void main(String[] args) {
           Scanner angka = new Scanner(System.in);
           
           System.out.print("Bilangan negatif ke-1: ");
           int angka1 = angka.nextInt();
           
           System.out.print("Bilangan negatif ke-2: ");
           int angka2 = angka.nextInt();
           
           System.out.print("Bilangan negatif ke-3: ");
           int angka3 = angka.nextInt();
           
           int penjumlahan = angka1 + angka2 + angka3;
           System.out.println ("Hasil Penjumlahan: " + penjumlahan);
           
           int pengurangan = angka1 - angka2 - angka3;
           System.out.println ("Hasil Pengurangan: " + pengurangan);
           
           int perkalian = angka1 * angka2 * angka3;
           System.out.println ("Hasil Perkalian: " + perkalian);
           
           if (angka2 != 0 && angka3 != 0) {
            double pembagian = (double) angka1 / angka2 / angka3;
            System.out.println("Hasil Pembagian: " + pembagian);
        } else {
            System.out.println("Error");
        }
    }
}
