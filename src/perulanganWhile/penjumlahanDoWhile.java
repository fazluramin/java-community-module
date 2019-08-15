/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganWhile;
import java.util.Scanner;
/**
 *
 * @author #root
 */
public class penjumlahanDoWhile {
         public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
         int Angka;
         int total=0;
         String Lagi;
         do {
             System.out.print("nilai:");
             Angka= sc.nextInt();
             total = total+Angka;
             System.out.print("menghitung lagi?");
             Lagi = sc.next();
         } while (!Lagi.equals("t"));
         System.out.println("Total="+total);
         }
}
