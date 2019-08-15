package Tugas_Member;

import java.util.Scanner;

public class Hal31_Nomer8_Versi2 {
    public static void main(String [] args){
        String angka; 
        int ratusan = 0;
        
        Scanner input= new Scanner (System.in);
        System.out.print("Masukkan Angka :");
        angka = input.next();
        
        int counter = angka.length();
        
        if(counter>=2){
            ratusan=Integer.parseInt(angka.substring(counter-3,counter-2));
            System.out.println("ratusan = "+ratusan);
        }
        else{
            System.out.println("ratusan = 0");
        }
}
}
