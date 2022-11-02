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
public class Kelulusan1 {
 public static void main(String[] args) {
// Buat Scanner
Scanner inp = new Scanner(System.in);
// Ambil Nama
System.out.print("Masukkan Nama:");
// Ambil NIM
System.out.print("Masukkan NIM:");
// Ambil Nilai
System.out.print("Masukkan Nilai Anda:");
int nilai = inp.nextInt();
// Print
if(nilai>=80){
    System.err.println("Selamat anda lulus");
}
else{
    System.err.println("anda tidak lulus");
}
}



}
