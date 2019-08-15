
package Tugas_Member;

import java.util.Scanner;

public class Hal32_Nomer11 {
    public static void main (String [] args){
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan angka ke-1 : ");
        a=in.nextInt();
        
        System.out.print("Masukkan angka ke-2 : ");
        b=in.nextInt();
        
        int hasil=a-b;
        int hasil2=b-a;
        
        if(hasil>0){
            System.out.print("Selisih kedua bilangan : "+hasil);
        }
        else if(hasil<0){
            System.out.print("Selisih kedua bilangan : "+hasil2);
        }
    }
}
