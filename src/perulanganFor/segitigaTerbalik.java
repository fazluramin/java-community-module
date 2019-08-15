/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganFor;

import java.util.Scanner;

/**
 *
 * @author #root
 */
public class segitigaTerbalik {
        public static void main(String [] args ){
        Scanner hady = new Scanner (System.in);
        int tinggi;
        System.out.print("input tinggi piramida = ");
        tinggi = hady.nextInt();
        int baris ,kolom ;
        for (baris = 1 ; baris <= tinggi ; baris ++){
        for (kolom = 1 ; kolom <= tinggi - baris; kolom ++ )
            System.out.print("*");
        for (kolom = 1 ; kolom < 1 * baris ; kolom ++)
            System.out.print("");
        System.out.println("");
        }
    }
}
