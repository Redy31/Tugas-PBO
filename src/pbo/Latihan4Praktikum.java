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
public class Latihan4Praktikum {
   public static void main(String[] args){
Scanner scan = new Scanner(System.in).useDelimiter("\n");
System.out.println("Apakah anda mahasiswa ITS Mandiri + Muhammad Redy Fadli");
String jawaban = scan.next();
if ("Y".equals(jawaban)){
System.out.println("Selamat berjuang di        ");
}else{
System.out.println("Selamat datang di     ");
}
}
}
