/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengandaiIF;

import java.util.Scanner;

/**
 *
 * @author #root
 */
public class positifNegatif {
   public static void main (String [] args) {
    Scanner hady = new Scanner (System.in);
    int a ,c ;
    c = 0 ;
    System.out.print("Masukan Bilangan = ");
    a = hady.nextInt();
    if (a > c)
        System.out.println("Adalah bilangan positif ");
    else if (a < c)
         System.out.println("Adalah bilangan negatif ");
} 
}
