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
public class jumlahDigit {
        public static void main (String [] args){
        Scanner inputangka = new Scanner (System.in);
        int angka , count = 0;
        System.out.println("Masukan angka : ");
        angka = inputangka.nextInt();
        while (angka > 0) {
        angka = angka / 10; 
        count++; 
        }
        {
            System.out.println ("Jumlah digit pada angka = " + count);
        }
    }
}
