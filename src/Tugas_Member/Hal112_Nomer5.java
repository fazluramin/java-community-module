package Tugas_Member;

import java.util.Scanner;

public class Hal112_Nomer5 {
    public static void main(String [] args){
        int naw=0
            ,nak=0
            ,jar=0
            ,kurs=0
            ,i=1;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Nilai Awal    : ");
        naw=input.nextInt();
        
        System.out.print("Nilai Akhir   : ");
        nak=input.nextInt();
        
        System.out.print("Jarak         : ");
        jar=input.nextInt();
        
        System.out.print("Kurs 1 Dollar : ");
        kurs=input.nextInt();
        
        do{
            Sysem.out.println(""+i);
            i++;
        }
        while(i<=nak);
}
}
