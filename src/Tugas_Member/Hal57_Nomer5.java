
package Tugas_Member;

import java.util.Scanner;

public class Hal57_Nomer5 {
    public Hal57_Nomer5(){
        int bil1,bil2,bil3;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan I : ");
        bil1=in.nextInt();
        
        System.out.print("Masukkan Bilangan II : ");
        bil2=in.nextInt();
        
        System.out.print("Masukkan Bilangan III : ");
        bil3=in.nextInt();
        
        System.out.println("==========================");
        
        //untuk Max Value
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
      
        //untuk Min Value
        if(bil1<bil3 && bil1<bil3){
            int terkecil=bil1;
            System.out.println("Bilangan terkecil : "+terkecil);
        }
        if(bil2<bil1 && bil2<bil3){
            int terkecil=bil2;
            System.out.println("Bilangan terkecil : "+terkecil);
        }
        if(bil3<bil1 && bil3<bil2){
            int terkecil=bil3;
            System.out.println("Bilangan terkecil: "+terkecil);
        }
    }
    
    public static void main(String []args){
        Hal57_Nomer5 No5=new Hal57_Nomer5();
    }
}
