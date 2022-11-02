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
public class Latihan5Praktikum {
    public static void main(String[] args){
int a = (int) (Math.random()*10), b = (int) (Math.random()*10), hasil = a+b;
Scanner scan = new Scanner(System.in).useDelimiter("\n");
System.out.println("Berapakah hasil dari "+a+" dan "+b+" ?");
int jawaban = scan.nextInt();
if (jawaban == hasil){
System.out.println("Selamat, Jawaban anda benar");
}else{
System.out.println("Maaf, Jawaban yang benar adalah "+hasil);
}
}
}
