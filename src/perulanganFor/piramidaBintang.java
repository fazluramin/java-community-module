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
public class piramidaBintang {
    public static void main(String[] args) {
int tinggi, baris, kolom;
Scanner scan = new Scanner (System.in);
System.out.print ("Tinggi segitiga = ");
tinggi = scan.nextInt ();
for (baris = 1; baris <= tinggi; baris++)
{
for (kolom = 1; kolom <= tinggi - baris; kolom++)

System.out.print(' ');                                               
//Tampilkan sejumlah *
for (kolom = 1; kolom <= 2 * baris - 1; kolom++)
System.out.print('*');
                                               
System.out.println(); //Pindah baris
}
}
}
