/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;
/**
 *
 * @author Muhammad Redy Fadli
 */
public class Soal3Praktikum {
    public static void main(String[] args) {
        Scanner Ke1 = new Scanner (System.in);
        System.out.println("Pilih metode");
        System.out.println("1. luas persegi");
        System.out.println("2. keliling persegi");
        
        System.out.print("pilihan =");
        int pilihan = Ke1.nextInt();
        
        System.out.print("Masukkan panjang sisi persegi =");
        int sisi = Ke1.nextInt();
        
        switch (pilihan){
            case 1 -> System.out.println(sisi * sisi + "cm");
            case 2 -> System.out.println(sisi + sisi + "cm");
            default -> System.out.println("error");
        }   
    }
}
