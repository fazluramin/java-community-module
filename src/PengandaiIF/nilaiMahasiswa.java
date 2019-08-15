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
public class nilaiMahasiswa {
    public static void main (String [] hady){
        int nim , nilaiAngka;
        char nilaiHuruf;
        String ket , nama;
        Scanner in = new Scanner (System.in);
        System.out.println("Nilai Mahasiswa Sistem Informasi");
        System.out.print("Nama : ");
        nama = in.nextLine();
        System.out.print("Nim : ");
        nim = in.nextInt();
        System.out.print("Nilai Angka : ");
        nilaiAngka = in.nextInt();
        
            if (nilaiAngka > 80){
                nilaiHuruf = 'A';
                ket = "Nilai sangat baik dan Lulus";
            }
            else if (nilaiAngka > 70){
                nilaiHuruf = 'B';
                ket = "Cukup Baik dan Lulus";
            }
            else if (nilaiAngka > 50){
                nilaiHuruf = 'C';
                ket = "Cukup tapi mengulang";
            }
            else {
                nilaiHuruf = 'D';
                ket = "Tidak Baik dan harus mengulang";
            }
            System.out.println("\n------------------------------");
            System.out.println("Mahasiswa dengan nama "+nama+" dan nim "+nim+
                    " \nGrade : "+nilaiHuruf+"\nKet :"+ket);     
    }
}
