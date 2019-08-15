package Tugas_Member;

import java.util.Scanner;

public class Hal230_Nomer6 {
    public static void main(String [] args){
        String teks;
        String urut;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Teks : ");
        teks=input.next();
        
        int panjangTeks = teks.length();
        for (int i = 0; i < panjangTeks; i++){
            
            char kar = teks.charAt(i);
            for(int hurufBesar=i; hurufBesar< panjangTeks; hurufBesar++){
                hurufBesar++
            }
    }
        
}
}
