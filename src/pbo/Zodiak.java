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
public class Zodiak {
    public static void main(String[] args) {
        Scanner zod =new Scanner(System.in);
        int zodiak;
        System.out.println("Masukkan nomor Bulan : ");
        zodiak = zod.nextInt();
        
        switch (zodiak){
            case 1 -> System.out.println("aquarius");
            case 2 -> System.out.println("pisces");
            case 3 -> System.out.println("aries");
            case 4 -> System.out.println("taurus");
            case 5 -> System.out.println("gemini");
            case 6 -> System.out.println("cancer");
            case 7 -> System.out.println("leo");
            case 8 -> System.out.println("virgo");
            case 9 -> System.out.println("libra");
            case 10 -> System.out.println("scorpio");
            case 11 -> System.out.println("sagitarius");
            case 12 -> System.out.println("capricorn");
        }
    }
}
