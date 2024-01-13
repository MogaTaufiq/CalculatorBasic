/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

/**
 *
 * @author MogaTaufiq
 */
import java.util.Scanner;

public class Kalkulator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2,jenisOperasi;

        System.out.println("==========================================");
        System.out.printf("%40s \n", "SELAMAT DATANG DI KALKULATOR SEDERHANA");
        System.out.println("==========================================");
        System.out.println("Pilih Jenis Operasi Matematika :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih jenis operasi : "); jenisOperasi = input.nextInt();

        System.out.println("==========================================");
        System.out.println("");
        System.out.printf("%-25s %-2s", "Masukkan angka pertama", "="); number1 = input.nextInt();
        System.out.printf("%-25s %-2s", "Masukkan angka kedua", "="); number2 = input.nextInt();
        System.out.println("");
        System.out.println("================== Hasil =================");

        if (jenisOperasi == 1) {
            System.out.printf("Hasil penjumlahan dari %d dengan %d adalah ", number1, number2);
            System.out.println(number1 + number2);
            System.out.println("");
        } else if (jenisOperasi == 2) {
            System.out.printf("Hasil pengurangan dari %d dengan %d adalah ", number1, number2);
            System.out.println(number1 - number2);
            System.out.println("");
        } else if (jenisOperasi == 3) {
            System.out.printf("Hasil perkalian dari %d dengan %d adalah ", number1, number2);
            System.out.println(number1 * number2);
            System.out.println("");
        } else if (jenisOperasi == 4) {
            System.out.printf("Hasil pembagian dari %d dengan %d adalah ", number1, number2);
            System.out.println(number1 / number2);
            System.out.println("");
        } 
    }  
}
