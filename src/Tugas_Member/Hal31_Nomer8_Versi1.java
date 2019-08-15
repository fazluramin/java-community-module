package Tugas_Member;

import java.util.Scanner;

public class Hal31_Nomer8_Versi1 {
    public static void main(String [] args){
        String angka; 
        int ratusan;
        
        Scanner input= new Scanner (System.in);
        System.out.print("Masukkan Angka :");
        angka = input.next();
        
        int counter = angka.length();
        
        if(counter==3){
            ratusan=Integer.parseInt(angka.substring(0,1));
            System.out.println("ratusan = "+ratusan);
        }
        else if(counter>3){
            ratusan=Integer.parseInt(angka.substring(1,2));
            System.out.println("ratusan = "+ratusan);
        }
        else{
            System.out.println("ratusan = 0");

    }
}
}
