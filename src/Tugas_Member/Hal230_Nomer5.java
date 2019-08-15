package Tugas_Member;

import java.util.Scanner;

public class Hal230_Nomer5 {
        public static void main(String []args){
        
        String teks;
        int spasi = 0,
        hurufKecil = 0,
        hurufBesar = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan kalimat : ");
        teks = in.nextLine();
            
            String teksBesar = teks.toUpperCase();
            String teksKecil = teks.toLowerCase();
            
            if (teks==teksKecil){
                System.out.println("Teks huruf Kecil Semua");
            }
            else if (teks==teksBesar){
                System.out.println("Teks huruf Besar Semua");
            }
            else{
                System.out.println("Teks huruf besar dan kecil");
        }   
        }
    
    
}
