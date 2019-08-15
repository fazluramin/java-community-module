/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerOnly;
import java.util.Scanner;

/**
 *
 * @author #root
 */
public class luasSegitiga {
    public static void main(String[] args) {
        Scanner hady = new Scanner (System.in);
        System.out.println("MENGHITUNG LUAS SEGITIGA\n");
        double a , t , L;
        double k = 0.5 ;
        System.out.println("Masukan Alas = ");
        a = hady.nextDouble();
        System.out.println("Masukan Tinggi = ");
        t = hady.nextDouble();
        L = a * t * k ;
        System.out.println("Luas Segitiga = "+L);
    }
}
