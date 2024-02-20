/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3;

/**
 *
 * @author dewipermatasuci
 */
public class Soal3 {

    public static void main(String[] args) {
        char karakter1 = '4';
        char karakter2 = '6';
        
        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;
        
        int jumlah = kodeASCII1 + kodeASCII2;
        
        System.out.println("Kode ASCII karakter '4': " + kodeASCII1);
        System.out.println("Kode ASCII karakter '6': " + kodeASCII2);
        System.out.println("Hasil penjumlahan kode ASCII: " + jumlah);
    }
}
