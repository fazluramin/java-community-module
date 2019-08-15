package Tugas_Member;

import java.util.Scanner;

public class Hal57_Nomer4 {
    public static void main(String []args){
        int bil1,bil2,bil3;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan I : ");
        bil1=in.nextInt();
        
        System.out.print("Masukkan Bilangan II : ");
        bil2=in.nextInt();
        
        System.out.print("Masukkan Bilangan III : ");
        bil3=in.nextInt();
        
        if(bil1>bil2 && bil1>bil3){
            int terbesar=bil1;
            System.out.println("Bilangan terbesar : "+terbesar);
        }
        if(bil2>bil3 && bil2>bil1){
            int terbesar=bil2;
            System.out.println("Bilangan terbesar : "+terbesar);
        }  
        if(bil3>bil2 && bil3>bil1){
            int terbesar=bil3;
            System.out.println("Bilangan terbesar : "+terbesar);
        }
}
}
 
           