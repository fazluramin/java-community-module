
package Tugas_Member;

import java.util.Scanner;

public class Hal57_Nomer6 {
    public Hal57_Nomer6(){
    int bil1, bil2, bil3, selisih;

    Scanner in=new Scanner(System.in);
        
    System.out.print("Masukkan Bilangan I : ");
    bil1=in.nextInt();
        
    System.out.print("Masukkan Bilangan II : ");
    bil2=in.nextInt();
        
    System.out.print("Masukkan Bilangan III : ");
    bil3=in.nextInt();
    
    int coba1=bil1-bil2;
    int coba2=bil1-bil3;
    int coba3=bil2-bil1;
    int coba4=bil2-bil3;
    int coba5=bil3-bil1;
    int coba6=bil3-bil2;
    
    if(coba1>coba2 && coba1>coba3 && coba1>coba4 && coba1>coba5 && coba1>coba6){
        System.out.println("Selisih terbesar adalah "+coba1+" , yaitu angka "+bil1+" dan "+bil2);
    }
    else if(coba2>coba1 && coba2>coba3 && coba2>coba4 && coba2>coba5 && coba2>coba6){
        System.out.println("Selisih terbesar adalah "+coba2+" , yaitu angka "+bil1+" dan "+bil3);
    }
    else if(coba3>coba1 && coba3>coba2 && coba3>coba4 && coba3>coba5 && coba3>coba6){
        System.out.println("Selisih terbesar adalah "+coba3+" , yaitu angka "+bil1+" dan "+bil2);
    }
    else if(coba4>coba1 && coba4>coba3 && coba4>coba2 && coba4>coba5 && coba4>coba6){
        System.out.println("Selisih terbesar adalah "+coba4+" , yaitu angka "+bil3+" dan "+bil2);
    }
    else if(coba5>coba1 && coba5>coba2 && coba5>coba3 && coba5>coba4 && coba5>coba6){
        System.out.println("Selisih terbesar adalah "+coba5+" , yaitu angka "+bil1+" dan "+bil3);
    }
    else if(coba6>coba1 && coba6>coba2 && coba6>coba3 && coba6>coba4 && coba6>coba5){
        System.out.println("Selisih terbesar adalah "+coba6+" , yaitu angka "+bil2+" dan "+bil3);
    }
    
}
    public static void main(String [] args){
        Hal57_Nomer6 No6=new Hal57_Nomer6();
    }
}
