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
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String nama, nim, semester, kelas;
        
        System.out.println("\t---------------");
        System.out.println("\tProgram Biodata");
        System.out.println("\t---------------");
        System.out.println();
        
         System.out.print("\tNama\t: ");
        nama=scan.nextLine();
         System.out.print("\tNim\t: ");
        nim=scan.nextLine();       
        System.out.print("\tSemester : ");
        semester=scan.nextLine();       
       System.out.print("\tKelas\t: ");
        kelas=scan.nextLine();       
       System.out.println();

        System.out.println("\t-----hasil-----");
        System.out.println("\tNama\t: "+nama);
        System.out.println("\tNim\t: "+nim);
        System.out.println("\tSemester: "+semester);
        System.out.println("\tKelas\t: "+kelas);
    }
}