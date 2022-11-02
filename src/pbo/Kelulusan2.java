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
public class Kelulusan2 {
    public static void main (String[] args) {
        String Jenis_Kelamin;
        int Tinggi;
        System.out.print("Kelamin (Laki-Laki/Perempuan) :");
        Scanner da = new Scanner(System.in);
   Jenis_Kelamin= da.nextLine();
      System.out.print("Tinggi Badan : ");
   Tinggi= da.nextInt();
   if ( "Laki-Laki".equals(Jenis_Kelamin)) {
        if(Tinggi <= 170){
       System.out.println("Anda Gagal");}
    else if((Tinggi >170) && (Tinggi <= 230)) 
       System.out.println("Selamat Anda Lulus");}
      if ("Perempuan".equals(Jenis_Kelamin)) {
        if(Tinggi <= 160){
       System.out.println("Anda Gagal");}
    else if((Tinggi >160) && (Tinggi <= 210)) 
       System.out.println("Selamat Anda Lulus");}
}
}
