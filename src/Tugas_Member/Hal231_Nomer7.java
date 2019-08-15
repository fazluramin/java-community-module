package Tugas_Member;

import java.util.Scanner;

public class Hal231_Nomer7 {
    public static void main (String [] args){
        String teks;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Masukkan Teks : ");
        teks=in.next();
        
        String cari;
        System.out.print("Teks yang hendak dicari : ");
        cari=in.next();
        
        String ganti;
        System.out.print("Diganti dengan : ");
        ganti=in.next();

        String kar=teks.replace(cari, ganti);
        
        System.out.println("Hasil Find and Replace : "+kar);
    }
}

